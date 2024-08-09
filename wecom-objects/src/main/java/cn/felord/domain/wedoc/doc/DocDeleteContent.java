package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 删除指定位置内容
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocDeleteContent {

    /**
     * 要删除的范围
     */
    private final DocRange range;


    /**
     * Instantiates a new Doc delete content.
     *
     * @param startIndex the start index
     * @param length     the length
     */
    DocDeleteContent(int startIndex, int length) {
        this(new DocRange(startIndex, length));
    }

    /**
     * Instantiates a new Doc delete content.
     *
     * @param range the range
     */
    DocDeleteContent(DocRange range) {
        this.range = range;
    }
}
