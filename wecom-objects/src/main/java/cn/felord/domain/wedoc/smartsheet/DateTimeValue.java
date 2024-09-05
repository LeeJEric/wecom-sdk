package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.FilterDateTimeType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Date time value.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class DateTimeValue {
    private final FilterDateTimeType type;
    private final List<String> value;

    /**
     * Instantiates a new Date time value.
     *
     * @param type  the type
     * @param value the value
     */
    @JsonCreator
    public DateTimeValue(@JsonProperty("type") FilterDateTimeType type,
                         @JsonProperty("value") List<String> value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Instantiates a new Date time value.
     *
     * @param type the type
     */
    public DateTimeValue(FilterDateTimeType type) {
        this(type, null);
    }
}
