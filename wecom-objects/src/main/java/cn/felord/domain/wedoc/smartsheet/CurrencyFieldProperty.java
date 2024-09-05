package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.CurrencyType;
import cn.felord.enumeration.DecimalPlaces;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Currency field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class CurrencyFieldProperty {
    private final String currencyType;
    private final Integer decimalPlaces;
    private final Boolean useSeparate;

    /**
     * Instantiates a new Currency field property.
     *
     * @param currencyType  the currency type
     * @param decimalPlaces the decimal places
     * @param useSeparate   the use separate
     */
    @JsonCreator
    CurrencyFieldProperty(@JsonProperty("currency_type") String currencyType,
                          @JsonProperty("decimal_places") Integer decimalPlaces,
                          @JsonProperty("use_separate") Boolean useSeparate) {
        this.currencyType = currencyType;
        this.decimalPlaces = decimalPlaces;
        this.useSeparate = useSeparate;
    }

    /**
     * Of currency field property.
     *
     * @param currencyType  the currency type
     * @param decimalPlaces the decimal places
     * @param useSeparate   the use separate
     * @return the currency field property
     */
    public static CurrencyFieldProperty of(CurrencyType currencyType, DecimalPlaces decimalPlaces, Boolean useSeparate) {
        return new CurrencyFieldProperty(currencyType.name(), decimalPlaces.getType(), useSeparate);
    }
}
