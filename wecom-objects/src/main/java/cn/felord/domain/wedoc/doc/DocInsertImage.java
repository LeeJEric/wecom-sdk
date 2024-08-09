package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

/**
 * 插入图片
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class DocInsertImage {
    /**
     * 文本
     */
    private final String imageId;
    /**
     * 位置
     */
    private final DocLocation location;
    /**
     * 图片的宽，单位是像素（px）， 不传默认为图片原始宽度
     */
    private final Integer width;
    /**
     * 图片的高， 单位是像素（px），不传默认为图片原始高度
     */
    private final Integer height;

    /**
     * Instantiates a new Doc insert text.
     *
     * @param imageId the image id
     * @param index   the index
     * @param width   the width
     * @param height  the height
     */
    DocInsertImage(String imageId, int index, int width, int height) {
        this(imageId, new DocLocation(index), width, height);
    }

    /**
     * Instantiates a new Doc insert image.
     *
     * @param imageId the image id
     * @param index   the index
     */
    DocInsertImage(String imageId, int index) {
        this(imageId, new DocLocation(index), null, null);
    }

    /**
     * Instantiates a new Doc insert text.
     *
     * @param imageId  the image id
     * @param location the location
     * @param width    the width
     * @param height   the height
     */
    DocInsertImage(String imageId, DocLocation location, Integer width, Integer height) {
        this.imageId = imageId;
        this.location = location;
        this.width = null;
        this.height = null;
    }
}
