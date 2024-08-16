package cn.felord.domain.wedoc.doc;

import lombok.Data;

import java.util.List;

/**
 * @author dax
 * @since 2024/8/16
 */
@Data
public class SheetBatchUpdateRequest {
    private final String docid;
    private final List<SheetUpdateRequest> requests;
}
