package cn.felord.domain.authentication;

import cn.felord.domain.WeComResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author n1
 * @since 2021/6/16 9:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SuiteTokenResponse extends WeComResponse {
    private String suiteAccessToken;
    private Integer expiresIn;
}
