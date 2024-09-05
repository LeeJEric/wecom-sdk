package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.AutoNumberRuleType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Auto number rule.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class AutoNumberRule {
    private final String type;
    private final String value;

    /**
     * Instantiates a new Auto number rule.
     *
     * @param type  the type
     * @param value the value
     */
    @JsonCreator
    AutoNumberRule(@JsonProperty("type") String type, @JsonProperty("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Of auto number rule.
     *
     * @param type  the type
     * @param value the value
     * @return the auto number rule
     */
    public static AutoNumberRule of(AutoNumberRuleType type, String value) {
        return new AutoNumberRule(type.name(), value);
    }
}
