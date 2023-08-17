package cn.felord.payment.wechat.v3.domain.direct.basepay.combine;

import cn.felord.payment.wechat.v3.domain.direct.basepay.Payer;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.RequiredArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * 直连模式-合单APP下单请求参数
 *
 * @author felord.cn
 * @since 2023 /8/17 11:23
 */
@RequiredArgsConstructor
public class CombineAppPayRequest {

    /**
     * 合单商户订单号，必填，商户侧需要保证同一商户下唯一
     */
    private final String combineOutTradeNo;
    /**
     * 子单信息，必填
     */
    private final List<SubOrder> subOrders;
    /**
     * 通知地址，必填，接收微信支付异步通知回调地址，通知url必须为直接可访问的URL，不能携带参数。
     * <p>
     * <strong>合单支付需要独立的通知地址。</strong>
     */
    private final String notifyUrl;
    /**
     * 合单支付者信息，选填
     */
    private Payer combinePayerInfo;
    /**
     * 合单支付场景信息描述，选填
     */
    private CombineSceneInfo sceneInfo;
    /**
     * 交易起始时间，选填
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime timeStart;
    /**
     * 交易结束时间，选填
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime timeExpire;

    /**
     * Combine payer info combine app pay request.
     *
     * @param combinePayerInfo the combine payer info
     * @return the combine app pay request
     */
    public CombineAppPayRequest combinePayerInfo(Payer combinePayerInfo) {
        this.combinePayerInfo = combinePayerInfo;
        return this;
    }

    /**
     * Scene info combine app pay request.
     *
     * @param sceneInfo the scene info
     * @return the combine app pay request
     */
    public CombineAppPayRequest sceneInfo(CombineSceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
        return this;
    }

    /**
     * Time start combine app pay request.
     *
     * @param timeStart the time start
     * @return the combine app pay request
     */
    public CombineAppPayRequest timeStart(OffsetDateTime timeStart) {
        this.timeStart = timeStart;
        return this;
    }

    /**
     * Time expire combine app pay request.
     *
     * @param timeExpire the time expire
     * @return the combine app pay request
     */
    public CombineAppPayRequest timeExpire(OffsetDateTime timeExpire) {
        this.timeExpire = timeExpire;
        return this;
    }

    /**
     * To params combine pay params.
     *
     * @param combineAppid the combine appid
     * @param combineMchid the combine mchid
     * @return the combine pay params
     */
    public CombinePayParams toPayParams(String combineAppid, String combineMchid) {
        return new CombinePayParams(combineAppid, combineMchid,
                combineOutTradeNo, combinePayerInfo,
                subOrders, notifyUrl,
                sceneInfo, timeStart, timeExpire);
    }

}
