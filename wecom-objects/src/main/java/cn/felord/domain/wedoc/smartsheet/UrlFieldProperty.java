package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Url field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class UrlFieldProperty {
    private final String type;

    /**
     * Instantiates a new Url field property.
     *
     * @param type the type
     */
    @JsonCreator
    UrlFieldProperty(@JsonProperty("type") String type) {
        this.type = type;
    }

    /**
     * 文字
     *
     * @return the url field property
     */
    public static UrlFieldProperty pureText() {
        return new UrlFieldProperty("LINK_TYPE_PURE_TEXT");
    }

    /**
     * 图标文字
     *
     * @return the url field property
     */
    public static UrlFieldProperty iconText() {
        return new UrlFieldProperty("LINK_TYPE_ICON_TEXT");
    }
}
