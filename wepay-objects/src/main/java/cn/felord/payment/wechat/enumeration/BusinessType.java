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

package cn.felord.payment.wechat.enumeration;

/**
 * The enum Business type.
 *
 * @author felord.cn
 * @since 1.0.16.RELEASE
 */
public enum BusinessType {
    /**
     * 代金券批次（暂不支持合作方为商户的场景）
     */
    FAVOR_STOCK,
    /**
     * 商家券批次
     */
    BUSIFAVOR_STOCK
}
