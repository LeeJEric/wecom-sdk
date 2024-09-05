package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Ww group field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class WwGroupFieldProperty {
    private final Boolean allowMultiple;

    /**
     * Instantiates a new Ww group field property.
     *
     * @param allowMultiple the allow multiple
     */
    @JsonCreator
    public WwGroupFieldProperty(@JsonProperty("allow_multiple") Boolean allowMultiple) {
        this.allowMultiple = allowMultiple;
    }
}
