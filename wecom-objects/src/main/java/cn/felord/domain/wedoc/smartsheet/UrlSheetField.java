package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Url sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class UrlSheetField extends SheetField {
    private final UrlFieldProperty propertyUrl;

    /**
     * Instantiates a new Url sheet field.
     *
     * @param fieldId     the field id
     * @param fieldType   the field type
     * @param propertyUrl the property url
     */
    public UrlSheetField(String fieldId, SheetFieldType fieldType, UrlFieldProperty propertyUrl) {
        super(fieldId, fieldType);
        this.propertyUrl = propertyUrl;
    }

    /**
     * Instantiates a new Url sheet field.
     *
     * @param fieldId     the field id
     * @param fieldType   the field type
     * @param fieldTitle  the field title
     * @param propertyUrl the property url
     */
    @JsonCreator
    public UrlSheetField(@JsonProperty("field_id") String fieldId,
                         @JsonProperty("field_type") SheetFieldType fieldType,
                         @JsonProperty("field_title") String fieldTitle,
                         @JsonProperty("property_url") UrlFieldProperty propertyUrl) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyUrl = propertyUrl;
    }
}
