package cn.felord.domain.wedoc.smartsheet;

import lombok.Data;

import java.util.List;

/**
 * @author dax
 * @since 2024/9/5
 */
@Data
public class DelFieldsRequest {
    private final String docid;
    private final String sheetId;
    private final List<String> fieldIds;
}
