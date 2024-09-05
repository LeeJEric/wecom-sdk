package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SheetFieldType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Currency sheet field.
 *
 * @author dax
 * @since 2024 /9/5
 */
@ToString
@Getter
public class CurrencySheetField extends SheetField {
    private final CurrencyFieldProperty propertyCurrency;

    /**
     * Instantiates a new Currency sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param propertyCurrency the property Currency
     */
    public CurrencySheetField(String fieldId, SheetFieldType fieldType, CurrencyFieldProperty propertyCurrency) {
        super(fieldId, fieldType);
        this.propertyCurrency = propertyCurrency;
    }

    /**
     * Instantiates a new Currency sheet field.
     *
     * @param fieldId          the field id
     * @param fieldType        the field type
     * @param fieldTitle       the field title
     * @param propertyCurrency the property Currency
     */
    @JsonCreator
    public CurrencySheetField(@JsonProperty("field_id") String fieldId,
                              @JsonProperty("field_type") SheetFieldType fieldType,
                              @JsonProperty("field_title") String fieldTitle,
                              @JsonProperty("property_currency") CurrencyFieldProperty propertyCurrency) {
        super(fieldId, fieldType, fieldTitle);
        this.propertyCurrency = propertyCurrency;
    }
}
