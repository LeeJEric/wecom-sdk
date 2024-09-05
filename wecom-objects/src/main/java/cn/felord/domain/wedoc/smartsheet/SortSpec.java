package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Sort spec.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class SortSpec {
    private final List<SortField> sortInfos;

    /**
     * Instantiates a new Sort spec.
     *
     * @param sortInfos the sort infos
     */
    @JsonCreator
    SortSpec(@JsonProperty("sort_infos") List<SortField> sortInfos) {
        this.sortInfos = sortInfos;
    }

    /**
     * From sort spec.
     *
     * @param sortInfos the sort infos
     * @return the sort spec
     */
    public static SortSpec from(List<SortField> sortInfos) {
        return new SortSpec(sortInfos);
    }
}
