package cn.felord.domain.wedoc.doc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Color.
 *
 * @author dax
 * @since 2024 /8/16
 */
@ToString
@Getter
public class Color {
    private final Integer red;
    private final Integer green;
    private final Integer blue;
    private final Integer alpha;

    /**
     * Instantiates a new Color.
     *
     * @param red   the red
     * @param green the green
     * @param blue  the blue
     * @param alpha the alpha
     */
    @JsonCreator
    public Color(@JsonProperty("red") Integer red,
                 @JsonProperty("green") Integer green,
                 @JsonProperty("blue") Integer blue,
                 @JsonProperty("alpha") Integer alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }
}
