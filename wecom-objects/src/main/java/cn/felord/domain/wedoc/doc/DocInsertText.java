package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 插入文本
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocInsertText {
    /**
     * 文本
     */
    private final String text;
    /**
     * 位置
     */
    private final DocLocation location;


    /**
     * Instantiates a new Doc insert text.
     *
     * @param text  the text
     * @param index the index
     */
    DocInsertText(String text, int index) {
        this(text, new DocLocation(index));
    }

    /**
     * Instantiates a new Doc insert text.
     *
     * @param text     the text
     * @param location the location
     */
    DocInsertText(String text, DocLocation location) {
        this.text = text;
        this.location = location;
    }
}
