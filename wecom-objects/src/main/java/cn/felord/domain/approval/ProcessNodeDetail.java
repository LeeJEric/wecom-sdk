package cn.felord.domain.approval;

import cn.felord.enumeration.ApvRel;
import cn.felord.enumeration.ProcessNodeStatus;
import cn.felord.enumeration.ProcessNodeType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.List;

/**
 * @author dax
 * @since 2024/4/17
 */
@Data
public class ProcessNodeDetail {
    /**
     * 节点类型 1:审批人 2:抄送人 3:办理人
     */
    @XStreamAlias("NodeType")
    private ProcessNodeType nodeType;
    /**
     * 节点状态
     */
    @XStreamAlias("SpStatus")
    private ProcessNodeStatus spStatus;
    /**
     * 多人审批方式 1-会签；2-或签 3-依次审批
     */
    @XStreamAlias("ApvRel")
    private ApvRel apvRel;
    /**
     * 子节点列表
     */
    @XStreamImplicit(itemFieldName = "SubNodeList")
    private List<ProcessSubNode> subNodeList;
}
