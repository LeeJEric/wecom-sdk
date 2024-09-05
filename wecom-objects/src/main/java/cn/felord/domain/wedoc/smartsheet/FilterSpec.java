package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.Conjunction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Filter spec.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class FilterSpec {
    private final Conjunction conjunction;
    private final List<? extends AbstractFilterCondition> conditions;


    /**
     * Instantiates a new Filter spec.
     *
     * @param conjunction the conjunction
     * @param conditions  the conditions
     */
    @JsonCreator
    FilterSpec(@JsonProperty("conjunction") Conjunction conjunction,
               @JsonProperty("conditions") List<? extends AbstractFilterCondition> conditions) {
        this.conjunction = conjunction;
        this.conditions = conditions;
    }

    /**
     * And filter spec.
     *
     * @param conditions the conditions
     * @return the filter spec
     */
    public FilterSpec and(List<? extends AbstractFilterCondition> conditions) {
        return new FilterSpec(Conjunction.CONJUNCTION_AND, conditions);
    }

    /**
     * Or filter spec.
     *
     * @param conditions the conditions
     * @return the filter spec
     */
    public FilterSpec or(List<? extends AbstractFilterCondition> conditions) {
        return new FilterSpec(Conjunction.CONJUNCTION_OR, conditions);
    }
}
