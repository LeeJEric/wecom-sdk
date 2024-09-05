package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.SmartSheetViewType;
import lombok.Data;

/**
 * @author dax
 * @since 2024/9/2
 */
@Data
public class SheetViewInfo {
    private String viewId;
    private String viewTitle;
    private SmartSheetViewType viewType;
}
