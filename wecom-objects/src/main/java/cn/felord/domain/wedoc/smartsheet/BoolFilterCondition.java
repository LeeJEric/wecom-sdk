package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.FilterOperator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Bool filter condition.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class BoolFilterCondition extends AbstractFilterCondition {
    private final BoolValue boolValue;

    /**
     * Instantiates a new Bool filter condition.
     *
     * @param fieldId   the field id
     * @param operator  the operator
     * @param boolValue the bool value
     */
    @JsonCreator
    BoolFilterCondition(@JsonProperty("field_id") String fieldId,
                        @JsonProperty("operator") FilterOperator operator,
                        @JsonProperty("bool_value") BoolValue boolValue) {
        super(fieldId, operator);
        this.boolValue = boolValue;
    }

    /**
     * Instantiates a new Bool filter condition.
     *
     * @param fieldId   the field id
     * @param operator  the operator
     * @param boolValue the bool value
     */
    public BoolFilterCondition(String fieldId, FilterOperator operator, boolean boolValue) {
        this(fieldId, operator, new BoolValue(boolValue));
    }
}
