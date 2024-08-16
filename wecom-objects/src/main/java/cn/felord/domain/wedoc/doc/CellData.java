package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * 单元格的信息
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class CellData {
    private final CellValue cellValue;
    private final CellFormat cellFormat;

    /**
     * Instantiates a new Cell data.
     *
     * @param cellValue  the cell value
     * @param cellFormat the cell format
     */
    public CellData(@JsonProperty("cell_value") CellValue cellValue, @JsonProperty("cell_format") CellFormat cellFormat) {
        this.cellValue = cellValue;
        this.cellFormat = cellFormat;
    }
}
