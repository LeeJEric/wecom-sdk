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

package cn.felord.reactive.api;

import cn.felord.domain.corpay.internal.*;
import cn.felord.enumeration.PaySignType;
import cn.felord.retrofit.WorkWechatRetrofitFactory;
import cn.felord.retrofit.ssl.SSLManager;
import cn.felord.xml.XStreamXmlReader;
import io.reactivex.rxjava3.core.Single;
import okhttp3.ConnectionPool;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * 企业红包和向员工付款
 *
 * @author dax
 * @since 2024/6/28
 */
public class InternalCorPayApi {
    private final String paySecret;
    private final String payAgentSecret;
    private final MmPayMktTransfersApi mmPayMktTransfersApi;

    /**
     * Instantiates a new Corpay api.
     *
     * @param paySecret      the pay secret
     * @param payAgentSecret the pay agent secret
     * @param sslManager     the ssl manager
     * @param connectionPool the connection pool
     * @param level          the level
     */
    InternalCorPayApi(String paySecret, String payAgentSecret, SSLManager sslManager, ConnectionPool connectionPool, HttpLoggingInterceptor.Level level) {
        this.paySecret = paySecret;
        this.payAgentSecret = payAgentSecret;
        this.mmPayMktTransfersApi = WorkWechatRetrofitFactory.create(sslManager, connectionPool, level)
                .create(MmPayMktTransfersApi.class);
    }


    /**
     * 发放企业红包
     *
     * @param request the request
     * @return the string
     */
    public Single<RedPackResponse> sendWorkWxRedPack(RedPackRequest request) {
        request.workWxSign(this.payAgentSecret);
        return mmPayMktTransfersApi.sendWorkWxRedPack(request.xmlBody(paySecret, PaySignType.MD5))
                .map(xml -> XStreamXmlReader.INSTANCE.read(xml, RedPackResponse.class));
    }


    /**
     * 查询红包记录
     *
     * @param request the request
     * @return the string
     */
    public Single<RedPackRecordResponse> queryWorkWxRedPack(RedPackRecordRequest request) {
        return mmPayMktTransfersApi.queryWorkWxRedPack(request.xmlBody(paySecret, PaySignType.MD5))
                .map(xml -> XStreamXmlReader.INSTANCE.read(xml, RedPackRecordResponse.class));
    }


    /**
     * 向员工付款
     *
     * @param request the request
     * @return the string
     */
    public Single<TransPocketResponse> payWwSpTrans2Pocket(TransPocketRequest request) {
        request.workWxSign(this.payAgentSecret);
        return mmPayMktTransfersApi.payWwSpTrans2Pocket(request.xmlBody(paySecret, PaySignType.MD5))
                .map(xml -> XStreamXmlReader.INSTANCE.read(xml, TransPocketResponse.class));
    }


    /**
     * 查询付款记录
     *
     * @param request the request
     * @return the string
     */
    public Single<TransPocketRecordResponse> queryWwSpTrans2Pocket(TransPocketRecordRequest request) {
        return mmPayMktTransfersApi.queryWwSpTrans2Pocket(request.xmlBody(paySecret, PaySignType.MD5))
                .map(xml -> XStreamXmlReader.INSTANCE.read(xml, TransPocketRecordResponse.class));
    }
}
