package cn.felord.domain.wedoc.smartsheet;

import lombok.Getter;
import lombok.ToString;

/**
 * The type Update view request.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class UpdateViewRequest {
    private final String docid;
    private final String sheetId;
    private final String viewId;
    private String viewTitle;
    private ViewProperty property;

    /**
     * Instantiates a new Update view request.
     *
     * @param docid   the docid
     * @param sheetId the sheet id
     * @param viewId  the view id
     */
    public UpdateViewRequest(String docid, String sheetId, String viewId) {
        this.docid = docid;
        this.sheetId = sheetId;
        this.viewId = viewId;
    }

    /**
     * View title update view request.
     *
     * @param viewTitle the view title
     * @return the update view request
     */
    public UpdateViewRequest viewTitle(String viewTitle) {
        this.viewTitle = viewTitle;
        return this;
    }

    /**
     * Property update view request.
     *
     * @param property the property
     * @return the update view request
     */
    public UpdateViewRequest property(ViewProperty property) {
        this.property = property;
        return this;
    }
}
