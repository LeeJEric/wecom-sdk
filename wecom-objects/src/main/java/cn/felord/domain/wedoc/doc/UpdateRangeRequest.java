package cn.felord.domain.wedoc.doc;

import lombok.Data;

/**
 * 更新范围内单元格内容请求，单次更新的范围大小需满足以下限制：
 * <p>
 * <ul>
 *     <li>范围行数 不大于 1000</li>
 *     <li>范围列数 不大于 200</li>
 *     <li>范围内的总单元格数量 不大于 10000</li>
 * </ul>
 *
 * @author dax
 * @since 2024 /8/16
 */
@Data
public class UpdateRangeRequest {
    /**
     * 工作表唯一标识
     */
    private final String sheetId;
    /**
     * 写入指定区域的数据
     */
    private final GridData gridData;
}
