package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Number sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class NumberSheetField extends SheetField {
    private final NumberFieldProperty propertyNumber;

    /**
     * Instantiates a new Number sheet field.
     *
     * @param fieldId        the field id
     * @param fieldType      the field type
     * @param propertyNumber the property number
     */
    public NumberSheetField(String fieldId, SheetFieldType fieldType, NumberFieldProperty propertyNumber) {
        super(fieldId, fieldType);
        this.propertyNumber = propertyNumber;
    }

    /**
     * Instantiates a new Number sheet field.
     *
     * @param fieldId        the field id
     * @param fieldType      the field type
     * @param fieldTitle     the field title
     * @param propertyNumber the property number
     */
    @JsonCreator
    public NumberSheetField(@JsonProperty("field_id") String fieldId,
                            @JsonProperty("field_type") SheetFieldType fieldType,
                            @JsonProperty("field_title") String fieldTitle,
                            @JsonProperty("property_number") NumberFieldProperty propertyNumber) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyNumber = propertyNumber;
    }
}
