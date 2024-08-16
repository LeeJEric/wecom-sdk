package cn.felord.domain.wedoc.doc;

import cn.felord.enumeration.SheetUpdateEvent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

/**
 * @author dax
 * @since 2024/8/16
 */
@ToString
@Getter
public class SheetUpdateResponse {
    private final AddSheetResponse addSheetResponse;
    private final UpdateRangeResponse updateRangeResponse;
    private final DeleteDimensionResponse deleteDimensionResponse;
    private final SheetId deleteSheetResponse;
    private final SheetUpdateEvent event;


    @JsonCreator
    SheetUpdateResponse(@JsonProperty("add_sheet_response") AddSheetResponse addSheetResponse,
                        @JsonProperty("update_range_response") UpdateRangeResponse updateRangeResponse,
                        @JsonProperty("delete_dimension_response") DeleteDimensionResponse deleteDimensionResponse,
                        @JsonProperty("delete_sheet_response") SheetId deleteSheetResponse) {
        this.addSheetResponse = addSheetResponse;
        this.updateRangeResponse = updateRangeResponse;
        this.deleteDimensionResponse = deleteDimensionResponse;
        this.deleteSheetResponse = deleteSheetResponse;
        this.event = this.event(addSheetResponse, updateRangeResponse, deleteDimensionResponse, deleteSheetResponse);
    }

    private SheetUpdateEvent event(AddSheetResponse addSheetResponse,
                                   UpdateRangeResponse updateRangeResponse,
                                   DeleteDimensionResponse deleteDimensionResponse,
                                   SheetId deleteSheetResponse) {
        if (Objects.nonNull(addSheetResponse)) {
            return SheetUpdateEvent.ADD_SHEET;
        } else if (Objects.nonNull(updateRangeResponse)) {
            return SheetUpdateEvent.UPDATE_RANGE;
        } else if (Objects.nonNull(deleteDimensionResponse)) {
            return SheetUpdateEvent.DELETE_DIMENSION;
        } else if (Objects.nonNull(deleteSheetResponse)) {
            return SheetUpdateEvent.DELETE_SHEET;
        }
        return SheetUpdateEvent.ERROR;
    }

}
