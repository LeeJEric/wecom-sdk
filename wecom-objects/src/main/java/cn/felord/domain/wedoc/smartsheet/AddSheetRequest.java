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
public class AddSheetRequest {

    private final String docid;
    private SmartSheetProperties properties;


    /**
     * Instantiates a new Add sheet request.
     *
     * @param docid the docid
     */
    public AddSheetRequest(String docid) {
        this.docid = docid;
    }

    /**
     * Instantiates a new Add sheet request.
     *
     * @param docId the doc id
     * @param title the title
     */
    public AddSheetRequest(String docId, String title) {
        this(docId, title, null);
    }

    /**
     * Instantiates a new Add sheet request.
     *
     * @param docId the doc id
     * @param index the index
     */
    public AddSheetRequest(String docId, int index) {
        this(docId, null, index);
    }

    /**
     * Instantiates a new Add sheet request.
     *
     * @param docId the doc id
     * @param title the title
     * @param index the index
     */
    public AddSheetRequest(String docId, String title, Integer index) {
        this.docid = docId;
        this.properties = new SmartSheetProperties(title, index);
    }

}
