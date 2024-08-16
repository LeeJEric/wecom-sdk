package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Delete dimension response.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class DeleteDimensionResponse {
    private final Integer deleted;

    /**
     * Instantiates a new Delete dimension response.
     *
     * @param deleted the deleted
     */
    @JsonCreator
    DeleteDimensionResponse(@JsonProperty("deleted") Integer deleted) {
        this.deleted = deleted;
    }
}
