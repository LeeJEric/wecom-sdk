package cn.felord.payment.wechat.v3.domain.busifavor;

import cn.felord.payment.wechat.enumeration.CouponState;
import cn.felord.payment.wechat.enumeration.StockType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.OffsetDateTime;

/**
 * The type Coupon detail.
 *
 * @author dax
 * @since 2023 /8/25
 */
@Data
public class CouponDetail {
    /**
     * 批次归属商户号
     */
    private String belongMerchant;
    /**
     * 商家券批次名称,[1,21]
     */
    private String stockName;
    /**
     * 批次备注,[1,20],选填
     */
    private String comment;
    /**
     * 适用商品范围
     * <p>
     * 用来描述批次在哪些商品可用，会显示在微信卡包中。字数上限为15个，一个中文汉字/英文字母/数字均占用一个字数。
     */
    private String goodsName;
    /**
     * 批次类型
     */
    private StockType stockType;
    /**
     * 是否允许转赠
     */
    private Boolean transferable;
    /**
     * 是否允许分享领券链接
     */
    private Boolean shareable;
    /**
     * 商家券状态
     */
    private CouponState couponState;
    /**
     * 样式信息
     */
    private DisplayPatternInfo displayPatternInfo;
    /**
     * 核销规则
     */
    private CouponUseRule couponUseRule;
    /**
     * 自定义入口
     */
    private CustomEntrance customEntrance;
    /**
     * 券的唯一标识
     */
    private String couponCode;
    /**
     * 批次唯一标识
     */
    private String stockId;
    /**
     * 券可使用开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime availableStartTime;
    /**
     * 券过期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime expireTime;
    /**
     * 券领取时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime receiveTime;
    /**
     * 发券请求单号
     * <p>
     * 发券时传入的唯一凭证
     */
    private String sendRequestNo;
    /**
     * 核销请求单号
     */
    private String useRequestNo;
    /**
     * 券核销时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime useTime;
    /**
     * 关联的商户订单号
     * <p>
     * 若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。
     */
    private String associateOutTradeNo;
    /**
     * 回退请求单号
     * <p>
     * 回退时传入的唯一凭证（如券发生了退回，将返回此字段）
     */
    private String returnRequestNo;
    /**
     * 回退时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime returnTime;
    /**
     * 失效请求单号
     * <p>
     * 失效时传入的唯一凭证（如果一张券已失效，将返回此字段）
     */
    private String deactivateRequestNo;
    /**
     * 券失效时间
     * <p>
     * 券被失效的时间（如果一张券已失效，将返回此字段）
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime deactivateTime;
    /**
     * 失效原因
     * <p>
     * 失效一张券的原因（如果一张券已失效，可能返回此字段）
     */
    private String deactivateReason;

}
