package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Delete sheet response.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class SheetId {
    private final String sheetId;

    /**
     * Instantiates a new Delete sheet response.
     *
     * @param sheetId the sheet id
     */
    @JsonCreator
    SheetId(@JsonProperty("sheet_id") String sheetId) {
        this.sheetId = sheetId;
    }
}
