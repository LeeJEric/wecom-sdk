package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * @author dax
 * @since 2024/8/16
 */
@ToString
@Getter
public class CellLink {
    private final String text;
    private final String url;

    @JsonCreator
    CellLink(@JsonProperty("text") String text, @JsonProperty("url") String url) {
        this.text = text;
        this.url = url;
    }
}
