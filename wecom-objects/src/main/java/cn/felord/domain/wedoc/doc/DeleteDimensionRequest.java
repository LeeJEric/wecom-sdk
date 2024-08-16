package cn.felord.domain.wedoc.doc;

import cn.felord.enumeration.Dimension;
import lombok.Getter;
import lombok.ToString;

/**
 * 删除表格连续的行（或列）的请求，注意：
 * <ul>
 *     <li>该操作会导致表格缩表</li>
 *     <li>删除的范围遵循 左闭右开</li>
 * </ul>
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class DeleteDimensionRequest {
    /**
     * 工作表唯一标识
     */
    private final String sheetId;
    private final Dimension dimension;

    /**
     * Instantiates a new Delete dimension request.
     *
     * @param sheetId   the sheet id
     * @param dimension the dimension
     */
    DeleteDimensionRequest(String sheetId, Dimension dimension) {
        this.sheetId = sheetId;
        this.dimension = dimension;
    }

    /**
     * 删除连续行
     *
     * @param sheetId the sheet id
     * @return the delete dimension request
     */
    public static DeleteDimensionRequest row(String sheetId) {
        return new DeleteDimensionRequest(sheetId, Dimension.ROW);
    }

    /**
     * 删除连续列
     *
     * @param sheetId the sheet id
     * @return the delete dimension request
     */
    public static DeleteDimensionRequest column(String sheetId) {
        return new DeleteDimensionRequest(sheetId, Dimension.COLUMN);
    }
}
