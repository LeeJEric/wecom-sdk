package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Location sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class LocationSheetField extends SheetField {
    private final LocationFieldProperty propertyLocation;

    /**
     * Instantiates a new Location sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param propertyLocation the property location
     */
    public LocationSheetField(String fieldId, SheetFieldType fieldType, LocationFieldProperty propertyLocation) {
        super(fieldId, fieldType);
        this.propertyLocation = propertyLocation;
    }

    /**
     * Instantiates a new Location sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param fieldTitle       the field title
     * @param propertyLocation the property location
     */
    @JsonCreator
    public LocationSheetField(@JsonProperty("field_id") String fieldId,
                              @JsonProperty("field_type") SheetFieldType fieldType,
                              @JsonProperty("field_title") String fieldTitle,
                              @JsonProperty("property_location") LocationFieldProperty propertyLocation) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyLocation = propertyLocation;
    }
}
