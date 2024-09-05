package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Created time sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class CreatedTimeSheetField extends SheetField {
    private final TimeFieldProperty propertyCreatedTime;

    /**
     * Instantiates a new CreatedTime sheet field.
     *
     * @param fieldId             the field id
     * @param fieldType           the field type
     * @param propertyCreatedTime the property created time
     */
    public CreatedTimeSheetField(String fieldId, SheetFieldType fieldType, TimeFieldProperty propertyCreatedTime) {
        super(fieldId, fieldType);
        this.propertyCreatedTime = propertyCreatedTime;
    }

    /**
     * Instantiates a new Created time sheet field.
     *
     * @param fieldId             the field id
     * @param fieldType           the field type
     * @param fieldTitle          the field title
     * @param propertyCreatedTime the property created time
     */
    @JsonCreator
    public CreatedTimeSheetField(@JsonProperty("field_id") String fieldId,
                                 @JsonProperty("field_type") SheetFieldType fieldType,
                                 @JsonProperty("field_title") String fieldTitle,
                                 @JsonProperty("property_created_time") TimeFieldProperty propertyCreatedTime) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyCreatedTime = propertyCreatedTime;
    }
}
