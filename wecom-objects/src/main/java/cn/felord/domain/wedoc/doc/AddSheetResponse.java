package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * 新增子表操作的请求响应体结构
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class AddSheetResponse {
    private final SheetProperties properties;

    /**
     * Instantiates a new Add sheet response.
     *
     * @param properties the properties
     */
    @JsonCreator
    AddSheetResponse(@JsonProperty("properties") SheetProperties properties) {
        this.properties = properties;
    }
}
