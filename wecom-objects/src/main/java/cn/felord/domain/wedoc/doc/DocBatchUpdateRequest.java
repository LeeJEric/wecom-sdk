package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * The type Doc batch update request.
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocBatchUpdateRequest {
    private final String docid;
    private final Integer verison;
    private final Set<DocUpdateRequest> requests;

    /**
     * Instantiates a new Doc batch update request.
     *
     * @param requests the requests
     * @param docid    the docid
     * @param version  the version
     */
    public DocBatchUpdateRequest(Set<DocUpdateRequest> requests, String docid, int version) {
        this.docid = docid;
        this.verison = version;
        this.requests = requests;
    }

    /**
     * Instantiates a new Doc batch update request.
     *
     * @param requests the requests
     * @param docid    the docid
     */
    public DocBatchUpdateRequest(Set<DocUpdateRequest> requests, String docid) {
        this.requests = requests;
        this.docid = docid;
        this.verison = null;
    }
}
