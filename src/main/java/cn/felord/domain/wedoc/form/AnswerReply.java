package cn.felord.domain.wedoc.form;

import lombok.Data;

import java.util.List;

/**
 * @author dax
 * @since 2023/3/16 16:25
 */
@Data
public class AnswerReply {
    private List<AnswerReplyItem> items;
}
