package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Progress sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class ProgressSheetField extends SheetField {
    private final ProgressFieldProperty propertyProgress;

    /**
     * Instantiates a new Progress sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param propertyProgress the property progress
     */
    public ProgressSheetField(String fieldId, SheetFieldType fieldType, ProgressFieldProperty propertyProgress) {
        super(fieldId, fieldType);
        this.propertyProgress = propertyProgress;
    }

    /**
     * Instantiates a new Progress sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param fieldTitle       the field title
     * @param propertyProgress the property progress
     */
    @JsonCreator
    public ProgressSheetField(@JsonProperty("field_id") String fieldId,
                              @JsonProperty("field_type") SheetFieldType fieldType,
                              @JsonProperty("field_title") String fieldTitle,
                              @JsonProperty("property_progress") ProgressFieldProperty propertyProgress) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyProgress = propertyProgress;
    }
}
