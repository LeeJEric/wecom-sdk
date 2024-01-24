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

package cn.felord.retrofit;

import cn.felord.retrofit.json.JsonConverterFactory;
import cn.felord.retrofit.ssl.SSLManager;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;

import java.util.concurrent.TimeUnit;

/**
 * The Retrofit factory.
 *
 * @author dax
 * @since 2024/5/21
 */
public final class WorkWechatRetrofitFactory {
    private static final String BASE_URL = "https://qyapi.weixin.qq.com/cgi-bin/";
    private static final String BASE_PAY_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/";
    public static final Retrofit RETROFIT_ = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient(HttpLoggingInterceptor.Level.NONE))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addCallAdapterFactory(ResponseBodyCallAdapterFactory.INSTANCE)
            .addConverterFactory(JsonConverterFactory.create())
            .build();

    private WorkWechatRetrofitFactory() {
    }

    /**
     * 带TokenApi拦截器的Retrofit客户端
     *
     * @param <T>            the type parameter
     * @param tokenApi       the token api
     * @param connectionPool the connection pool
     * @param level          the level
     * @return the retrofit
     */
    public static <T extends TokenApi> Retrofit create(T tokenApi, ConnectionPool connectionPool, HttpLoggingInterceptor.Level level) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient(tokenApi, connectionPool, level))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addCallAdapterFactory(ResponseBodyCallAdapterFactory.INSTANCE)
                .addConverterFactory(JsonConverterFactory.create())
                .build();
    }

    /**
     * SSL Retrofit
     * <p>
     * 带SSL的Retrofit客户端，支付使用
     *
     * @param sslManager     the ssl manager
     * @param connectionPool the connection pool
     * @param level          the level
     * @return the retrofit
     */
    public static Retrofit create(SSLManager sslManager, ConnectionPool connectionPool, HttpLoggingInterceptor.Level level) {
        return new Retrofit.Builder()
                .baseUrl(BASE_PAY_URL)
                .client(okHttpClient(sslManager, connectionPool, level))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addCallAdapterFactory(ResponseBodyCallAdapterFactory.INSTANCE)
                .addConverterFactory(JsonConverterFactory.create())
                .build();
    }

    private static OkHttpClient okHttpClient(SSLManager sslManager, ConnectionPool connectionPool, HttpLoggingInterceptor.Level level) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(level);
        return new OkHttpClient.Builder()
                .connectionPool(connectionPool)
                .sslSocketFactory(sslManager.getSslSocketFactory(), sslManager.getTrustManager())
                .addInterceptor(httpLoggingInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    private static OkHttpClient okHttpClient(TokenApi tokenApi, ConnectionPool connectionPool, HttpLoggingInterceptor.Level level) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(level);
        return new OkHttpClient.Builder()
                .connectionPool(connectionPool)
                .addInterceptor(new TokenInterceptor(tokenApi))
                .addInterceptor(httpLoggingInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    private static OkHttpClient okHttpClient(HttpLoggingInterceptor.Level level) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(level);
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .build();
    }
}
