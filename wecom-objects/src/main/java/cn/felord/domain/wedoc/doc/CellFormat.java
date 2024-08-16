package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * 单元格的样式信息
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class CellFormat {
    private final TextFormat textFormat;

    /**
     * Instantiates a new Cell format.
     *
     * @param textFormat the text format
     */
    @JsonCreator
    CellFormat(@JsonProperty("text_format") TextFormat textFormat) {
        this.textFormat = textFormat;
    }

    /**
     * Instantiates a new Cell format.
     *
     * @param color         the color
     * @param underline     the underline
     * @param fontSize      the font size
     * @param bold          the bold
     * @param strikethrough the strikethrough
     * @param italic        the italic
     * @param font          the font
     */
    public CellFormat(Color color,
                      Boolean underline,
                      Integer fontSize,
                      Boolean bold,
                      Boolean strikethrough,
                      Boolean italic,
                      String font) {
        this.textFormat = new TextFormat(color, underline, fontSize, bold, strikethrough, italic, font);
    }

}
