package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Attachment sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class AttachmentSheetField extends SheetField {
    private final AttachmentFieldProperty propertyAttachment;

    /**
     * Instantiates a new Attachment sheet field.
     *
     * @param fieldId            the field id
     * @param fieldType          the field type
     * @param propertyAttachment the property attachment
     */
    public AttachmentSheetField(String fieldId, SheetFieldType fieldType, AttachmentFieldProperty propertyAttachment) {
        super(fieldId, fieldType);
        this.propertyAttachment = propertyAttachment;
    }

    /**
     * Instantiates a new Attachment sheet field.
     *
     * @param fieldId            the field id
     * @param fieldType          the field type
     * @param fieldTitle         the field title
     * @param propertyAttachment the property attachment
     */
    @JsonCreator
    public AttachmentSheetField(@JsonProperty("field_id") String fieldId,
                                @JsonProperty("field_type") SheetFieldType fieldType,
                                @JsonProperty("field_title") String fieldTitle,
                                @JsonProperty("property_attachment") AttachmentFieldProperty propertyAttachment) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyAttachment = propertyAttachment;
    }
}
