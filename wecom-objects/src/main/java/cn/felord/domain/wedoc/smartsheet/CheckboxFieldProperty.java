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
public class CheckboxFieldProperty {
    private final Boolean checked;

    /**
     * Instantiates a new Checkbox field property.
     *
     * @param checked the checked
     */
    @JsonCreator
    public CheckboxFieldProperty(@JsonProperty("checked") Boolean checked) {
        this.checked = checked;
    }
}
