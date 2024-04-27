package cn.felord.domain.approval;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.util.List;

/**
 * @author dax
 * @since 2024/4/17
 */
@Data
public class ProcessList {
    @XStreamImplicit(itemFieldName = "NodeList")
    private List<ProcessNodeDetail> nodeList;
}
