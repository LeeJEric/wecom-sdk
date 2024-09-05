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
package cn.felord.payment.wechat.v3.domain.payscore;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 创建支付分订单请求参数.
 *
 * @author felord.cn
 * @since 1.0.2.RELEASE
 */
@ToString
@RequiredArgsConstructor
@Getter
public class UserServiceOrderParams {

    /**
     * 商户服务订单号，必填
     * <p>
     * 商户系统内部服务订单号（不是交易单号），要求此参数只能由数字、大小写字母_-|*组成，且在同一个商户号下唯一。详见[商户订单号]。
     */
    private final String outOrderNo;
    /**
     * 与传入的商户号建立了支付绑定关系的appid，必填
     */
    private final String appid;
    /**
     * 服务ID，必填
     * <p>
     * 该服务ID有本接口对应产品的权限。
     */
    private final String serviceId;
    /**
     * 服务信息，必填
     * <p>
     * 用于介绍本订单所提供的服务 ，当参数长度超过20个字符时，报错处理。
     */
    private final String serviceIntroduction;
    /**
     * 服务时间段，必填
     */
    private final TimeRange timeRange;
    /**
     * 订单风险金，必填
     */
    private final RiskFund riskFund;
    /**
     * 商户回调地址，必填
     */
    private final String notifyUrl;
    /**
     * 后付费项目，选填
     */
    private List<PostPayment> postPayments;
    /**
     * 后付费商户优惠，选填
     */
    private List<PostDiscount> postDiscounts;
    /**
     * 服务位置，选填
     */
    private Location location;
    /**
     * 商户数据包，选填
     * <p>
     * 商户数据包可存放本订单所需信息，需要先urlencode后传入。 当商户数据包总长度超出256字符时，报错处理。
     */
    private String attach;
    /**
     * 微信用户在商户对应appid下的唯一标识，条件选填
     * <p>
     * 免确认订单：必填
     * 需确认订单：不填
     */
    private String openid;
    /**
     * 是否需要用户确认，选填
     * <p>
     * false：免确认订单
     * true：需确认订单
     * 默认值true
     */
    private Boolean needUserConfirm = Boolean.TRUE;


    public UserServiceOrderParams postPayments(List<PostPayment> postPayments) {
        this.postPayments = postPayments;
        return this;
    }

    public UserServiceOrderParams postDiscounts(List<PostDiscount> postDiscounts) {
        this.postDiscounts = postDiscounts;
        return this;
    }

    public UserServiceOrderParams location(Location location) {
        this.location = location;
        return this;
    }

    public UserServiceOrderParams attach(String attach) {
        this.attach = attach;
        return this;
    }

    public UserServiceOrderParams openid(String openid) {
        this.openid = openid;
        return this;
    }

    public UserServiceOrderParams needUserConfirm(Boolean needUserConfirm) {
        this.needUserConfirm = needUserConfirm;
        return this;
    }
}
