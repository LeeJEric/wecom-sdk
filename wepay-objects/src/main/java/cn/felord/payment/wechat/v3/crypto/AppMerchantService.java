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

package cn.felord.payment.wechat.v3.crypto;

import cn.felord.payment.PayException;

/**
 * 获取商户配置信息
 *
 * @author dax
 * @since 2024/8/6
 */
public interface AppMerchantService {
    /**
     * Load merchant merchant.
     *
     * @param appid the app id
     * @return the merchant config
     * @throws PayException the pay exception
     */
    AppMerchant loadMerchant(String appid) throws PayException;
}
