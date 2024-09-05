package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Reference sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class ReferenceSheetField extends SheetField {
    private final ReferenceFieldProperty propertyReference;

    /**
     * Instantiates a new Reference sheet field.
     *
     * @param fieldId           the field id
     * @param fieldType         the field type
     * @param propertyReference the property reference
     */
    public ReferenceSheetField(String fieldId, SheetFieldType fieldType, ReferenceFieldProperty propertyReference) {
        super(fieldId, fieldType);
        this.propertyReference = propertyReference;
    }

    /**
     * Instantiates a new Reference sheet field.
     *
     * @param fieldId           the field id
     * @param fieldType         the field type
     * @param fieldTitle        the field title
     * @param propertyReference the property reference
     */
    @JsonCreator
    public ReferenceSheetField(@JsonProperty("field_id") String fieldId,
                               @JsonProperty("field_type") SheetFieldType fieldType,
                               @JsonProperty("field_title") String fieldTitle,
                               @JsonProperty("property_reference") ReferenceFieldProperty propertyReference) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyReference = propertyReference;
    }
}
