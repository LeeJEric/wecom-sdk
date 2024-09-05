package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type User field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class UserFieldProperty {
    private final Boolean isMultiple;
    private final Boolean isNotified;

    /**
     * Instantiates a new User field property.
     *
     * @param isMultiple the is multiple
     * @param isNotified the is notified
     */
    @JsonCreator
    public UserFieldProperty(@JsonProperty("is_multiple") Boolean isMultiple,
                             @JsonProperty("is_notified") Boolean isNotified) {
        this.isMultiple = isMultiple;
        this.isNotified = isNotified;
    }
}
