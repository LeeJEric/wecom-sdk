package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SelectFieldStyle;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Select field option.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class SelectFieldOption {
    private final String id;
    private final String text;
    private final Integer style;

    /**
     * Instantiates a new Select field option.
     *
     * @param id    the id
     * @param text  the text
     * @param style the style
     */
    @JsonCreator
    SelectFieldOption(@JsonProperty("id") String id,
                      @JsonProperty("text") String text,
                      @JsonProperty("style") Integer style) {
        this.id = id;
        this.text = text;
        this.style = style;
    }

    /**
     * Instantiates a new Select field option.
     *
     * @param id    the id
     * @param text  the text
     * @param style the style
     */
    public SelectFieldOption(String id, String text, SelectFieldStyle style) {
        this(id, text, style.getStyle());
    }
}
