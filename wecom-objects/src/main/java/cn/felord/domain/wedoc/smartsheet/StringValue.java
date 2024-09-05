package cn.felord.domain.wedoc.smartsheet;

import lombok.Data;

import java.util.Set;

/**
 * @author dax
 * @since 2024/9/2
 */
@Data
public class StringValue {
    private final Set<String> value;
}
