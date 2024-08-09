package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * The type Doc update text property.
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocUpdateTextProperty {
    private final DocTextProperty textProperty;
    private final Set<DocRange> ranges;


    /**
     * Instantiates a new Doc update text property.
     *
     * @param bold            the bold
     * @param color           the color
     * @param backgroundColor the background color
     * @param ranges          the ranges
     */
    DocUpdateTextProperty(boolean bold, String color, String backgroundColor, Set<DocRange> ranges) {
        this(new DocTextProperty(bold, color, backgroundColor), ranges);
    }

    /**
     * Instantiates a new Doc update text property.
     *
     * @param textProperty the text property
     * @param ranges       the ranges
     */
    DocUpdateTextProperty(DocTextProperty textProperty, Set<DocRange> ranges) {
        this.textProperty = textProperty;
        this.ranges = ranges;
    }
}
