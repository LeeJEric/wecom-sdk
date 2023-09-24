/*
 *  Copyright (c) 2023. felord.cn
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package cn.felord.api;

import cn.felord.WeComException;
import cn.felord.domain.wedrive.BufferSource;
import cn.felord.domain.wedrive.FileDownloadResponse;
import cn.felord.domain.wedrive.FileId;
import cn.felord.domain.wedrive.SelectedTicket;
import cn.felord.retrofit.WorkWechatRetrofitFactory;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * The type File manager api.
 *
 * @author dax
 * @since 2023 /6/26 17:07
 */
public class FileManagerApi {
    private final InternalFileManagerApi internalFileManagerApi;
    private final DownloadApi downloadApi;

    /**
     * Instantiates a new File manager api.
     *
     * @param retrofit the retrofit
     */
    FileManagerApi(Retrofit retrofit) {
        this.internalFileManagerApi = retrofit.create(InternalFileManagerApi.class);
        this.downloadApi = WorkWechatRetrofitFactory.RETROFIT_.create(DownloadApi.class);
    }

    /**
     * 下载文件（通过文件fileid）
     *
     * @param fileid the fileid
     * @return the file download response
     * @throws WeComException the weComException
     */
    public BufferSource downloadByFileId(String fileid) throws WeComException {
        FileDownloadResponse downloadResponse = internalFileManagerApi.getFileUrlByFileId(new FileId(fileid));
        return this.download(downloadResponse);
    }

    /**
     * 下载文件（微盘和文件选择器jsapi返回的selectedTicket）
     *
     * @param selectedTicket the selected ticket
     * @return the file download response
     * @throws WeComException the weComException
     */
    public BufferSource downloadBySelectedTicket(String selectedTicket) throws WeComException {
        FileDownloadResponse downloadResponse = internalFileManagerApi.getFileUrlBySelectedTicket(new SelectedTicket(selectedTicket));
        return this.download(downloadResponse);
    }

    private BufferSource download(FileDownloadResponse downloadResponse) {
        String downloadUrl = downloadResponse.getDownloadUrl();
        String cookie = downloadResponse.getCookieName()
                .concat("=")
                .concat(downloadResponse.getCookieValue());
        try (ResponseBody body = downloadApi.download(downloadUrl, cookie)) {
            return new BufferSource(body.contentType(), body.contentLength(), body.source());
        }
    }

    /**
     * 微盘文件下载
     */
    interface DownloadApi {
        /**
         * 文件下载
         *
         * @param downloadUrl the download url
         * @param cookie      the cookie
         * @return the response body
         * @throws WeComException the weComException
         */
        @POST
        ResponseBody download(@Url String downloadUrl, @Header("Cookie") String cookie) throws WeComException;
    }

}
