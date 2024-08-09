package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 表示从start_index开始的一段范围
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocRange {
    /**
     * 起始位置，从0开始
     */
    private final int startIndex;
    /**
     * 长度
     */
    private final int length;

    /**
     * Instantiates a new Doc range.
     *
     * @param startIndex the start index
     * @param length     the length
     */
    DocRange(int startIndex, int length) {
        this.startIndex = startIndex;
        this.length = length;
    }
}
