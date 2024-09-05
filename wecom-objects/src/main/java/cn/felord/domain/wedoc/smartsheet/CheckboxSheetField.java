package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Checkbox sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class CheckboxSheetField extends SheetField {
    private final CheckboxFieldProperty propertyCheckbox;

    /**
     * Instantiates a new Checkbox sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param propertyCheckbox the property checkbox
     */
    public CheckboxSheetField(String fieldId, SheetFieldType fieldType, CheckboxFieldProperty propertyCheckbox) {
        super(fieldId, fieldType);
        this.propertyCheckbox = propertyCheckbox;
    }

    /**
     * Instantiates a new Checkbox sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param fieldTitle       the field title
     * @param propertyCheckbox the property checkbox
     */
    @JsonCreator
    public CheckboxSheetField(@JsonProperty("field_id") String fieldId,
                              @JsonProperty("field_type") SheetFieldType fieldType,
                              @JsonProperty("field_title") String fieldTitle,
                              @JsonProperty("property_checkbox") CheckboxFieldProperty propertyCheckbox) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyCheckbox = propertyCheckbox;
    }
}
