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
public class GroupSpec {
    private final List<SortField> groups;

    /**
     * Instantiates a new Sort spec.
     *
     * @param groups the groups
     */
    @JsonCreator
    GroupSpec(@JsonProperty("sort_infos") List<SortField> groups) {
        this.groups = groups;
    }

    /**
     * From sort spec.
     *
     * @param groups the groups
     * @return the sort spec
     */
    public static GroupSpec from(List<SortField> groups) {
        return new GroupSpec(groups);
    }
}
