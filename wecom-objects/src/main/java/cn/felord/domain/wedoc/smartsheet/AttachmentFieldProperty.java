package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Checkbox field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class AttachmentFieldProperty {
    private final String displayMode;

    /**
     * Instantiates a new Checkbox field property.
     *
     * @param displayMode the display mode
     */
    @JsonCreator
    AttachmentFieldProperty(@JsonProperty("display_mode") String displayMode) {
        this.displayMode = displayMode;
    }

    /**
     * 列表样式
     *
     * @return the attachment field property
     */
    public static AttachmentFieldProperty list() {
        return new AttachmentFieldProperty("DISPLAY_MODE_LIST");
    }

    /**
     * 宫格样式
     *
     * @return the attachment field property
     */
    public static AttachmentFieldProperty grid() {
        return new AttachmentFieldProperty("DISPLAY_MODE_GRID");
    }

}
