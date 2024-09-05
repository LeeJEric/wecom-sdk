package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.FilterOperator;
import cn.felord.json.FilterConditionDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author dax
 * @since 2024/9/2
 */
@ToString
@RequiredArgsConstructor
@JsonDeserialize(using = FilterConditionDeserializer.class)
public abstract class AbstractFilterCondition {
    private final String fieldId;
    private final FilterOperator operator;
}
