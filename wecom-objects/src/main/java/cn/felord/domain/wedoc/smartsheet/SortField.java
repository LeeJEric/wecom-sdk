package cn.felord.domain.wedoc.smartsheet;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Sort field.
 *
 * @author dax
 * @since 2024 /9/2
 */
@ToString
@Getter
public class SortField {
    private final String fieldId;
    private final Boolean desc;

    /**
     * Instantiates a new Sort field.
     *
     * @param fieldId the field id
     * @param desc    the desc
     */
    @JsonCreator
    SortField(@JsonProperty("field_id") String fieldId, @JsonProperty("desc") Boolean desc) {
        this.fieldId = fieldId;
        this.desc = desc;
    }

    /**
     * Desc sort field.
     *
     * @param fieldId the field id
     * @return the sort field
     */
    public static SortField desc(String fieldId) {
        return new SortField(fieldId, true);
    }

    /**
     * Asc sort field.
     *
     * @param fieldId the field id
     * @return the sort field
     */
    public static SortField asc(String fieldId) {
        return new SortField(fieldId, false);
    }
}
