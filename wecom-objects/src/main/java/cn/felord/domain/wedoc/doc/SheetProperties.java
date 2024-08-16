package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * 工作表元数据相关的资源描述
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class SheetProperties {
    private final String sheetId;
    private final String title;
    private final Integer rowCount;
    private final Integer columnCount;

    /**
     * Instantiates a new Sheet properties.
     *
     * @param sheetId     the sheet id
     * @param title       the title
     * @param rowCount    the row count
     * @param columnCount the column count
     */
    @JsonCreator
    SheetProperties(@JsonProperty("sheet_id") String sheetId,
                    @JsonProperty("title") String title,
                    @JsonProperty("row_count") Integer rowCount,
                    @JsonProperty("column_count") Integer columnCount) {
        this.sheetId = sheetId;
        this.title = title;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
}
