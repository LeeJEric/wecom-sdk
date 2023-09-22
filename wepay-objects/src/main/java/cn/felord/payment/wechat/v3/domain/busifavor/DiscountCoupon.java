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
package cn.felord.payment.wechat.v3.domain.busifavor;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * 商家券核销规则-折扣券使用规则
 *
 * @author felord.cn
 * @since 1.0.4.RELEASE
 */
@ToString
@Getter
public class DiscountCoupon {

    /**
     * 折扣百分比，例如：88为八八折
     */
    private final Integer discountPercent;
    /**
     * 消费门槛，单位：分。
     * <p>
     * 特殊规则：取值范围 1 ≤ transactionMinimum ≤ 10000000
     */
    private final Long transactionMinimum;

    /**
     * Instantiates a new Discount coupon.
     *
     * @param discountPercent    the discount percent
     * @param transactionMinimum the transaction minimum
     */
    @JsonCreator
    public DiscountCoupon(@JsonProperty("discount_percent") Integer discountPercent,
                          @JsonProperty("transaction_minimum") Long transactionMinimum) {
        this.discountPercent = discountPercent;
        this.transactionMinimum = transactionMinimum;
    }
}