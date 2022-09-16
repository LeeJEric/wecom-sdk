package cn.felord.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 对于类似该结构的进行统一泛型封装
 *
 * @author n1
 * @since 2021/6/17 17:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GenericResponse<T> extends WeComResponse {
    @JsonAlias({"openid",
            "id",
            "userid",
            "join_qrcode",
            "userlist",
            "user_info",
            "follow_user",
            "department_id",
            "department_list",
            "department",
            "active_cnt",
            "tagid",
            "taglist",
            "jobid",
            "ip_list",
            "external_userid",
            "contact_way",
            "strategy_id",
            "tag_group",
            "chat_id",
            "failed_chat_list"
    })
    private T data;
}
