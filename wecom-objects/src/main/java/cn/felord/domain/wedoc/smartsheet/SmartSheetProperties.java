package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Sheet properties.
 *
 * @author dax
 * @since 2024 /8/30
 */
@ToString
@Getter
public class SmartSheetProperties {
    private final String title;
    private final Integer index;
    private final String sheetId;

    /**
     * Instantiates a new Sheet properties.
     *
     * @param title the title
     * @param index the index
     */
    public SmartSheetProperties(String title, Integer index) {
        this(title, index, null);
    }

    /**
     * Instantiates a new Sheet properties.
     *
     * @param title   the title
     * @param index   the index
     * @param sheetId the sheet id
     */
    @JsonCreator
    public SmartSheetProperties(@JsonProperty("title") String title,
                                @JsonProperty("index") Integer index,
                                @JsonProperty("sheet_id") String sheetId) {
        this.title = title;
        this.index = index;
        this.sheetId = sheetId;
    }
}
