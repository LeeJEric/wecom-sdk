package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Update range response.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class UpdateRangeResponse {
    private final Integer updatedCells;

    /**
     * Instantiates a new Update range response.
     *
     * @param updatedCells the updated cells
     */
    @JsonCreator
    UpdateRangeResponse(@JsonProperty("updated_cells") Integer updatedCells) {
        this.updatedCells = updatedCells;
    }
}
