package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * @author dax
 * @since 2024/9/4
 */
@ToString
@Getter
public class ReferenceFieldProperty {
    private final String subId;
    private final String filedId;
    private final String isMultiple;
    private final String viewId;

    @JsonCreator
    public ReferenceFieldProperty(@JsonProperty("sub_id") String subId,
                                  @JsonProperty("filed_id") String filedId,
                                  @JsonProperty("is_multiple") String isMultiple,
                                  @JsonProperty("view_id") String viewId) {
        this.subId = subId;
        this.filedId = filedId;
        this.isMultiple = isMultiple;
        this.viewId = viewId;
    }
}
