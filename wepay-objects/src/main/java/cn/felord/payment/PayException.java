/*
 * Copyright (c) 2024. felord.cn
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       https://www.apache.org/licenses/LICENSE-2.0
 * Website:
 *       https://felord.cn
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.felord.payment;


/**
 * The type Pay exception.
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
public class PayException extends RuntimeException {

    /**
     * Instantiates a new Pay exception.
     */
    public PayException() {
    }

    public PayException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param cause the cause
     */
    public PayException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Pay exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public PayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
