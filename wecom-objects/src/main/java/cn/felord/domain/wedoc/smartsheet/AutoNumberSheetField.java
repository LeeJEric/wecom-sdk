package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type AutoNumber sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class AutoNumberSheetField extends SheetField {
    private final AutoNumberFieldProperty propertyAutoNumber;

    /**
     * Instantiates a new AutoNumber sheet field.
     *
     * @param fieldId            the field id
     * @param fieldType          the field type
     * @param propertyAutoNumber the property AutoNumber
     */
    public AutoNumberSheetField(String fieldId, SheetFieldType fieldType, AutoNumberFieldProperty propertyAutoNumber) {
        super(fieldId, fieldType);
        this.propertyAutoNumber = propertyAutoNumber;
    }

    /**
     * Instantiates a new AutoNumber sheet field.
     *
     * @param fieldId            the field id
     * @param fieldType          the field type
     * @param fieldTitle         the field title
     * @param propertyAutoNumber the property AutoNumber
     */
    @JsonCreator
    public AutoNumberSheetField(@JsonProperty("field_id") String fieldId,
                                @JsonProperty("field_type") SheetFieldType fieldType,
                                @JsonProperty("field_title") String fieldTitle,
                                @JsonProperty("property_auto_number") AutoNumberFieldProperty propertyAutoNumber) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyAutoNumber = propertyAutoNumber;
    }
}
