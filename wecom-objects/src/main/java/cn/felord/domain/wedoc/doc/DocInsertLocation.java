package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 指定位置插入段落或者分页符
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocInsertLocation {
    /**
     * 位置
     */
    private final DocLocation location;

    /**
     * Instantiates a new Doc insert page break.
     *
     * @param index the index
     */
    DocInsertLocation(int index) {
        this(new DocLocation(index));
    }

    /**
     * Instantiates a new Doc insert page break.
     *
     * @param location the location
     */
    DocInsertLocation(DocLocation location) {
        this.location = location;
    }
}
