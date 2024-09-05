package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.DecimalPlaces;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Progress field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class ProgressFieldProperty {
    private final Integer decimalPlaces;


    /**
     * Instantiates a new Progress field property.
     *
     * @param decimalPlaces the decimal places
     */
    @JsonCreator
    ProgressFieldProperty(@JsonProperty("decimal_places") Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;

    }

    /**
     * Of progress field property.
     *
     * @param decimalPlaces the decimal places
     * @return the number field property
     */
    public ProgressFieldProperty of(DecimalPlaces decimalPlaces) {
        return new ProgressFieldProperty(decimalPlaces.getType());
    }
}
