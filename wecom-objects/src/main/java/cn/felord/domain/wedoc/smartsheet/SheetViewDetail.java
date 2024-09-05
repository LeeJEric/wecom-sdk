package cn.felord.domain.wedoc.smartsheet;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author dax
 * @since 2024/9/4
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SheetViewDetail extends SheetViewInfo {
    private ViewProperty property;
}
