package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Select field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class SelectFieldProperty {
    private final Boolean isQuickAdd;
    private final List<SelectFieldOption> options;

    /**
     * Instantiates a new Select field property.
     *
     * @param isQuickAdd the is quick add
     * @param options    the options
     */
    @JsonCreator
    public SelectFieldProperty(@JsonProperty("isQuickAdd") Boolean isQuickAdd,
                               @JsonProperty("options") List<SelectFieldOption> options) {
        this.isQuickAdd = isQuickAdd;
        this.options = options;
    }
}
