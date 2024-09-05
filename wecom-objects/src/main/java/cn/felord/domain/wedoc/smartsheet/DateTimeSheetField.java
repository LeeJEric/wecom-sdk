package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Date time sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class DateTimeSheetField extends SheetField {
    private final DateTimeFieldProperty propertyDateTime;

    /**
     * Instantiates a new Date time sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param propertyDateTime the property date time
     */
    public DateTimeSheetField(String fieldId, SheetFieldType fieldType, DateTimeFieldProperty propertyDateTime) {
        super(fieldId, fieldType);
        this.propertyDateTime = propertyDateTime;
    }

    /**
     * Instantiates a new Date time sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param fieldTitle       the field title
     * @param propertyDateTime the property date time
     */
    @JsonCreator
    public DateTimeSheetField(@JsonProperty("field_id") String fieldId,
                              @JsonProperty("field_type") SheetFieldType fieldType,
                              @JsonProperty("field_title") String fieldTitle,
                              @JsonProperty("property_date_time") DateTimeFieldProperty propertyDateTime) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyDateTime = propertyDateTime;
    }
}
