package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 标准文档中的一个位置
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocLocation {
    /**
     * 位置
     */
    private final int index;

    /**
     * Instantiates a new Doc location.
     *
     * @param index the index
     */
    DocLocation(int index) {
        this.index = index;
    }
}
