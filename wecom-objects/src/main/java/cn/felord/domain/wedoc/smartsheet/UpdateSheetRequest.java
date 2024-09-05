package cn.felord.domain.wedoc.smartsheet;

import lombok.Getter;
import lombok.ToString;

/**
 * The type Add sheet request.
 *
 * @author dax
 * @since 2024 /8/30
 */
@ToString
@Getter
public class UpdateSheetRequest {

    private final String docid;
    private final SmartSheetProperties properties;


    /**
     * Instantiates a new Add sheet request.
     *
     * @param docId   the doc id
     * @param sheetId the sheet id
     */
    public UpdateSheetRequest(String docId, String sheetId) {
        this(docId, sheetId, null);
    }

    /**
     * Instantiates a new Add sheet request.
     *
     * @param docId   the doc id
     * @param sheetId the sheet id
     * @param title   the title
     */
    public UpdateSheetRequest(String docId, String sheetId, String title) {
        this.docid = docId;
        this.properties = new SmartSheetProperties(title, null, sheetId);
    }

}
