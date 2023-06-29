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


import cn.felord.WeComException;
import cn.felord.domain.WeComResponse;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Token interceptor.
 *
 * @author dax
 * @since 2023 /5/22 14:59
 */
public final class ResponseBodyCallAdapterFactory extends CallAdapter.Factory {

    /**
     * The constant INSTANCE.
     */
    public static final ResponseBodyCallAdapterFactory INSTANCE = new ResponseBodyCallAdapterFactory();

    private ResponseBodyCallAdapterFactory() {
    }

    @Override
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        return new ResponseBodyCallAdapter<>(returnType);
    }

    /**
     * The type Body call adapter.
     *
     * @param <R> the type parameter
     */
    static final class ResponseBodyCallAdapter<R> implements CallAdapter<R, R> {

        private final Type returnType;

        /**
         * Instantiates a new Body call adapter.
         *
         * @param returnType the return type
         */
        ResponseBodyCallAdapter(Type returnType) {
            this.returnType = returnType;
        }

        @Override
        public Type responseType() {
            return this.returnType;
        }

        @Override
        public R adapt(Call<R> call) {

            Response<R> response;
            try {
                response = call.execute();
            } catch (IOException e) {
                throw new WeComException(e.getMessage());
            }

            if (response.isSuccessful()) {
                R body = response.body();
                if (body != null && WeComResponse.class.isAssignableFrom(body.getClass())) {
                    WeComResponse weComResponse = (WeComResponse) body;
                    if (weComResponse.isError()) {
                        throw new WeComException(weComResponse.getErrcode(), weComResponse.getErrmsg());
                    }
                }
                return body;
            }
            throw new WeComException(" response is not successful, " + response.message());
        }
    }
}
