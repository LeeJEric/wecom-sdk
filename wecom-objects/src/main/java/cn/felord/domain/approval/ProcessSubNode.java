package cn.felord.domain.approval;

import cn.felord.domain.callback.CallbackUserId;
import cn.felord.enumeration.ProcessNodeStatus;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

/**
 * @author dax
 * @since 2024/4/17
 */
@ToString
@Setter
public class ProcessSubNode {
    /**
     * 处理人信息
     */
    @XStreamAlias("UserInfo")
    private String userid;
    /**
     * 审批/办理意见
     */
    @XStreamAlias("Speech")
    private String speech;
    /**
     * 子节点状态
     */
    @XStreamAlias("SpYj")
    private ProcessNodeStatus spYj;
    /**
     * 操作时间
     */
    @XStreamAlias("Sptime")
    private Instant sptime;
    /**
     * 附件
     * TODO 没有明确回调样例，暂时忽略
     */
    @XStreamAlias("MediaIds")
    private List<String> mediaIds;
    /**
     * 回调专用，不对外暴露getter
     */
    @XStreamAlias(value = "UserInfo")
    private CallbackUserId userInfo;

    public String getUserid() {
        return userInfo != null ? userInfo.getUserId() : this.userid;
    }

    public String getSpeech() {
        return speech;
    }

    public ProcessNodeStatus getSpYj() {
        return spYj;
    }

    public Instant getSptime() {
        return sptime;
    }

    public List<String> getMediaIds() {
        return mediaIds;
    }
}
