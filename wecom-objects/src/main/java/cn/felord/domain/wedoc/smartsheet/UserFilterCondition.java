package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.FilterOperator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * The type User filter condition.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class UserFilterCondition extends AbstractFilterCondition {
    private final StringValue userValue;

    /**
     * Instantiates a new User filter condition.
     *
     * @param fieldId   the field id
     * @param operator  the operator
     * @param userValue the user value
     */
    @JsonCreator
    UserFilterCondition(@JsonProperty("field_id") String fieldId,
                        @JsonProperty("operator") FilterOperator operator,
                        @JsonProperty("user_value") StringValue userValue) {
        super(fieldId, operator);
        this.userValue = userValue;
    }

    /**
     * Instantiates a new User filter condition.
     *
     * @param fieldId  the field id
     * @param operator the operator
     * @param value    the value
     */
    public UserFilterCondition(String fieldId, FilterOperator operator, Set<String> value) {
        this(fieldId, operator, new StringValue(value));
    }
}
