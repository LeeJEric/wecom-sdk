package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 文本属性
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocTextProperty {
    /**
     * 是否加粗
     */
    private final boolean blod;
    /**
     * 文字颜色，十六进制RRGGBB格式
     */
    private final String color;
    /**
     * 文字的背景颜色，十六进制RRGGBB 格式
     */
    private final String backgroundColor;

    /**
     * Instantiates a new Doc text property.
     *
     * @param bold            the blod
     * @param color           the color
     * @param backgroundColor the background color
     */
    DocTextProperty(boolean bold, String color, String backgroundColor) {
        this.blod = bold;
        this.color = color;
        this.backgroundColor = backgroundColor;
    }
}
