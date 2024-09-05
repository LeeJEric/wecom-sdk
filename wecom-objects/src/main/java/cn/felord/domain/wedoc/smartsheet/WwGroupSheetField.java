package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type WwGroup sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class WwGroupSheetField extends SheetField {
    private final WwGroupFieldProperty propertyWwGroup;

    /**
     * Instantiates a new WwGroup sheet field.
     *
     * @param fieldId         the field id
     * @param fieldType       the field type
     * @param propertyWwGroup the property WwGroup
     */
    public WwGroupSheetField(String fieldId, SheetFieldType fieldType, WwGroupFieldProperty propertyWwGroup) {
        super(fieldId, fieldType);
        this.propertyWwGroup = propertyWwGroup;
    }

    /**
     * Instantiates a new WwGroup sheet field.
     *
     * @param fieldId         the field id
     * @param fieldType       the field type
     * @param fieldTitle      the field title
     * @param propertyWwGroup the property WwGroup
     */
    @JsonCreator
    public WwGroupSheetField(@JsonProperty("field_id") String fieldId,
                             @JsonProperty("field_type") SheetFieldType fieldType,
                             @JsonProperty("field_title") String fieldTitle,
                             @JsonProperty("property_ww_group") WwGroupFieldProperty propertyWwGroup) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyWwGroup = propertyWwGroup;
    }
}
