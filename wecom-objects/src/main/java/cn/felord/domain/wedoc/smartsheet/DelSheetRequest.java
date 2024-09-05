package cn.felord.domain.wedoc.smartsheet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author dax
 * @since 2024/8/30
 */
@ToString
@RequiredArgsConstructor
@Getter
public class DelSheetRequest {
    private final String docid;
    private final String sheetId;
}
