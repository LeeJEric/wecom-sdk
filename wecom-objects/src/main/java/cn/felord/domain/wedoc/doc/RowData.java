package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

/**
 * 行数据的资源描述
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class RowData {
    private final List<CellData> values;

    /**
     * Instantiates a new Row data.
     *
     * @param values the values
     */
    @JsonCreator
    RowData(@JsonProperty("values") List<CellData> values) {
        this.values = values;
    }

    /**
     * Of row data.
     *
     * @param values the values
     * @return the row data
     */
    public static RowData of(List<CellData> values) {
        return new RowData(values);
    }

    /**
     * Of row data.
     *
     * @param values the values
     * @return the row data
     */
    public static RowData of(CellData... values) {
        return new RowData(Arrays.asList(values));
    }
}
