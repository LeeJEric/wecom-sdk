package cn.felord.domain.approval;

import lombok.Data;

import java.util.List;

/**
 * 新版流程列表
 *
 * @author dax
 * @since 2024/4/17
 */
@Data
public class ApprovalProcess {
    private final List<ProcessNode> nodeList;
}
