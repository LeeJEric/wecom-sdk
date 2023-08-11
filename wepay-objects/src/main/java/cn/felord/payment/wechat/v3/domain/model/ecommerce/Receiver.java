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
package cn.felord.payment.wechat.v3.domain.model.ecommerce;

import cn.felord.payment.wechat.enumeration.ReceiverType;
import lombok.Data;

/**
 * 分账接收方信息
 *
 * @author felord.cn
 * @since 1.0.11.RELEASE
 */
@Data
public class Receiver {
    /**
     * 分账接收方类型，必填
     */
    private ReceiverType type;
    /**
     * 分账接收方帐号，必填
     */
    private String receiverAccount;
    /**
     * 分账金额，必填
     * <p>
     * 单位为分，只能为整数，不能超过原订单支付金额及最大分账比例金额
     */
    private Integer amount;
    /**
     * 分账的原因描述，必填。分账账单中需要体现
     */
    private String description;
    /**
     * 分账个人接收方姓名，选填
     * <p>
     * 在接收方类型为个人的时可选填，若有值，会检查与 name 是否实名匹配，不匹配会拒绝分账请求
     * <ol>
     *     <li>分账接收方类型是{@code PERSONAL_OPENID}，是个人姓名的密文（选传，传则校验） 此字段的加密方法详见：敏感信息加密说明</li>
     *     <li>使用微信支付平台证书中的公钥</li>
     *     <li>使用RSAES-OAEP算法进行加密</li>
     *     <li>将请求中HTTP头部的Wechatpay-Serial设置为证书序列号</li>
     * </ol>
     */
    private String receiverName;
}
