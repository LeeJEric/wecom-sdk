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

package cn.felord.domain.corpay.miniapppay;

import cn.felord.enumeration.CashType;
import cn.felord.enumeration.PromotionScope;
import lombok.Data;

import java.util.List;

/**
 * 优惠功能
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class PromotionDetail {

    /**
     * 优惠券面额，单位【分】
     */
    private Long amount;
    /**
     * 券ID
     */
    private String couponId;
    /**
     * 优惠币种，内商户号仅支持人民币 CNY
     */
    private String currency;
    /**
     * 单品列表信息
     */
    private List<PromotionGoodsDetail> goodsDetail;
    /**
     * 商户出资，单位为分
     */
    private Long merchantContribute;
    /**
     * 优惠名称
     */
    private String name;
    /**
     * 其他出资，单位为分
     */
    private Long otherContribute;
    /**
     * 优惠范围
     * <ul>
     *     <li>GLOBAL：全场代金券</li>
     *     <li>SINGLE：单品优惠</li>
     * </ul>
     */
    private PromotionScope scope;
    /**
     * 活动ID
     */
    private String stockId;
    /**
     * 优惠类型
     * <ul>
     *     <li>CASH：充值</li>
     *     <li>NOCASH：预充值</li>
     * </ul>
     */
    private CashType type;
    /**
     * 微信出资，单位为分
     */
    private Long wechatpayContribute;

}
