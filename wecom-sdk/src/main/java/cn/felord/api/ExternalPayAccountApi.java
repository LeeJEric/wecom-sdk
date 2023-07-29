package cn.felord.api;

import cn.felord.WeComException;
import cn.felord.domain.GenericResponse;
import cn.felord.domain.corpay.external.account.ApplyStatusResponse;
import cn.felord.domain.corpay.external.account.MchAccountRequest;
import cn.felord.domain.corpay.external.account.OutRequestNo;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 对外收款账户API
 *
 * @author dax
 * @since 2023 /7/3 15:57
 */
public interface ExternalPayAccountApi {

    /**
     * 提交创建对外收款账户的申请单(进件)
     * <p>
     * 企业可以通过这个接口快速递交材料，用于创建对外收款账户申请单
     * 图片ID通过提交图片接口获取
     * 同一个提现人员最多申请200个商户号，同一个企业最多申请2000个商户号
     * 目前本接口仅支持『对外收款』应用调用，即获取access_token时需要使用『对外收款』应用的SECRET
     *
     * @param request the request
     * @return the generic response
     * @throws WeComException the we com exception
     */
    @POST("miniapppay/apply_mch")
    GenericResponse<String> applyMch(@Body MchAccountRequest request) throws WeComException;

    /**
     * 查询申请单状态
     * <p>
     * 通过这个接口查询已提交的申请单状态
     * 使用提交创建对外收款账户的申请单接口中填写的out_request_no来查询
     * 目前本接口仅支持『对外收款』应用调用，即获取access_token时需要使用『对外收款』应用的SECRET
     *
     * @param outRequestNo the out request no
     * @return the applyment status
     * @throws WeComException the we com exception
     */
    @POST("miniapppay/get_applyment_status")
    ApplyStatusResponse getApplymentStatus(@Body OutRequestNo outRequestNo) throws WeComException;
}
