package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Sheet batch update response.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class SheetBatchUpdateResponse {
    private final List<SheetBatchUpdateResponse> responses;

    /**
     * Instantiates a new Sheet batch update response.
     *
     * @param responses the responses
     */
    @JsonCreator
    SheetBatchUpdateResponse(@JsonProperty("responses") List<SheetBatchUpdateResponse> responses) {
        this.responses = responses;
    }
}
