package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 新增工作表
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class AddSheetRequest {
    /**
     * 工作表名称
     */
    private final String sheetName;
    /**
     * 新增工作表的初始行数
     */
    private final Integer rowCount;
    /**
     * 新增工作表的初始列数
     */
    private final Integer columnCount;

    /**
     * Instantiates a new Add sheet request.
     *
     * @param sheetName   the sheet name
     * @param rowCount    the row count
     * @param columnCount the column count
     */
    AddSheetRequest(String sheetName, Integer rowCount, Integer columnCount) {
        this.sheetName = sheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
}
