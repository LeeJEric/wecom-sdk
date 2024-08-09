package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * 文本替换
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocReplaceText {

    /**
     * 要替换的文本
     */
    private final String text;

    /**
     * 要替换的文档范围，可同时替换多个位置的文本, ranges个数不超过10。
     */
    private final Set<DocRange> ranges;

    /**
     * Instantiates a new Doc replace text.
     *
     * @param text   the text
     * @param ranges the ranges
     */
    DocReplaceText(String text, Set<DocRange> ranges) {
        this.text = text;
        this.ranges = ranges;
    }
}
