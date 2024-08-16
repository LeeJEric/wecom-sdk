package cn.felord.domain.wedoc.doc;

import cn.felord.utils.StringUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Cell value.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class CellValue {
    private final String text;
    private final CellLink link;


    /**
     * Instantiates a new Cell value.
     *
     * @param text the text
     * @param url  the url
     */
    @JsonCreator
    CellValue(@JsonProperty("text") String text, @JsonProperty("url") String url) {
        if (StringUtils.hasText(url)) {
            this.text = null;
            this.link = new CellLink(text, url);
        } else {
            this.text = text;
            this.link = null;
        }
    }

    /**
     * 文本
     *
     * @param text the text
     * @return the cell value
     */
    public static CellValue text(String text) {
        return new CellValue(text, null);
    }

    /**
     * 链接
     *
     * @param text the text
     * @param url  the url
     * @return the cell value
     */
    public static CellValue link(String text, String url) {
        return new CellValue(text, url);
    }

    public boolean isLink() {
        return link != null;
    }
}
