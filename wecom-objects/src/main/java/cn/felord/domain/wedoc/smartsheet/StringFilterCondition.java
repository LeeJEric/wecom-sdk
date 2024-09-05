package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.FilterOperator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * The type String filter condition.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class StringFilterCondition extends AbstractFilterCondition {
    private final StringValue stringValue;

    /**
     * Instantiates a new String filter condition.
     *
     * @param fieldId     the field id
     * @param operator    the operator
     * @param stringValue the value
     */
    @JsonCreator
    StringFilterCondition(@JsonProperty("field_id") String fieldId,
                          @JsonProperty("operator") FilterOperator operator,
                          @JsonProperty("string_value") StringValue stringValue) {
        super(fieldId, operator);
        this.stringValue = stringValue;
    }

    /**
     * Instantiates a new String filter condition.
     *
     * @param fieldId  the field id
     * @param operator the operator
     * @param value    the value
     */
    public StringFilterCondition(String fieldId, FilterOperator operator, Set<String> value) {
        this(fieldId, operator, new StringValue(value));
    }
}
