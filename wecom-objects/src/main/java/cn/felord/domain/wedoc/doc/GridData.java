package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Grid data.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class GridData {
    private final Integer startRow;
    private final Integer startColumn;
    private final List<RowData> rows;

    /**
     * Instantiates a new Grid data.
     *
     * @param startRow    the start row
     * @param startColumn the start column
     * @param rows        the rows
     */
    @JsonCreator
    GridData(@JsonProperty("start_row") Integer startRow,
             @JsonProperty("start_column") Integer startColumn,
             @JsonProperty("rows") List<RowData> rows) {
        this.startRow = startRow;
        this.startColumn = startColumn;
        this.rows = rows;
    }
}
