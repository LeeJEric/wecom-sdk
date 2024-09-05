package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.DateTimeFieldFormatter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Time field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class TimeFieldProperty {
    private final String format;

    /**
     * Instantiates a new Time field property.
     *
     * @param format the format
     */
    @JsonCreator
    TimeFieldProperty(@JsonProperty("format") String format) {
        this.format = format;
    }

    /**
     * Of time field property.
     *
     * @param formatter the formatter
     * @return the date time field property
     */
    public static TimeFieldProperty of(DateTimeFieldFormatter formatter) {
        return new TimeFieldProperty(formatter.getFormat());
    }
}
