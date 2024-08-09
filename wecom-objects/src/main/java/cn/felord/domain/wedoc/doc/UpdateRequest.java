package cn.felord.domain.wedoc.doc;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * The type Update request.
 *
 * @author dax
 * @since 2024 /8/9
 */
@ToString
@Getter
public class UpdateRequest {
    /**
     * 替换指定位置文本内容
     */
    private DocReplaceText replaceText;
    /**
     * 在指定位置插入文本内容
     */
    private DocInsertText insertText;
    /**
     * 删除指定位置内容
     */
    private DocDeleteContent deleteContent;
    /**
     * 在指定位置插入图片
     */
    private DocInsertImage insertImage;
    /**
     * 在指定位置插入分页符
     */
    private DocInsertLocation insertPageBreak;
    /**
     * 在指定位置插入表格
     */
    private DocInsertTable insertTable;
    /**
     * 在指定位置插入段落
     */
    private DocInsertLocation insertParagraph;
    /**
     * 更新指定位置文本属性
     */
    private DocUpdateTextProperty updateTextProperty;

    private UpdateRequest() {
    }

    /**
     * 替换指定位置文本内容
     *
     * @param text   the text
     * @param ranges the ranges
     * @return the update request
     */
    public static UpdateRequest replaceText(String text, Set<DocRange> ranges) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.replaceText = new DocReplaceText(text, ranges);
        return updateRequest;
    }

    /**
     * 在指定位置插入文本内容
     *
     * @param text  the text
     * @param index the index
     * @return the update request
     */
    public static UpdateRequest insertText(String text, int index) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertText = new DocInsertText(text, index);
        return updateRequest;
    }

    /**
     * 删除指定位置内容
     *
     * @param startIndex the start index
     * @param length     the length
     * @return the update request
     */
    public static UpdateRequest deleteContent(int startIndex, int length) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.deleteContent = new DocDeleteContent(startIndex, length);
        return updateRequest;
    }

    /**
     * 在指定位置插入图片
     *
     * @param imageId the image id
     * @param index   the index
     * @param width   the width
     * @param height  the height
     * @return the update request
     */
    public static UpdateRequest insertImage(String imageId, int index, int width, int height) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertImage = new DocInsertImage(imageId, index, width, height);
        return updateRequest;
    }

    /**
     * 在指定位置插入图片
     *
     * @param imageId the image id
     * @param index   the index
     * @return the update request
     */
    public static UpdateRequest insertImage(String imageId, int index) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertImage = new DocInsertImage(imageId, index);
        return updateRequest;
    }

    /**
     * 在指定位置插入图片
     *
     * @param insertImage the insert image
     * @return the update request
     */
    public static UpdateRequest insertImage(DocInsertImage insertImage) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertImage = insertImage;
        return updateRequest;
    }

    /**
     * 在指定位置插入分页符
     *
     * @param index the index
     * @return the update request
     */
    public static UpdateRequest insertPageBreak(int index) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertPageBreak = new DocInsertLocation(index);
        return updateRequest;
    }

    /**
     * 在指定位置插入表格
     *
     * @param index the index
     * @param rows  the rows
     * @param cols  the cols
     * @return the update request
     */
    public static UpdateRequest insertTable(int index, int rows, int cols) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertTable = new DocInsertTable(index, rows, cols);
        return updateRequest;
    }

    /**
     * 在指定位置插入段落
     *
     * @param index the index
     * @return the update request
     */
    public static UpdateRequest insertParagraph(int index) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.insertParagraph = new DocInsertLocation(index);
        return updateRequest;
    }

    /**
     * 更新指定位置文本属性
     *
     * @param bold            the bold
     * @param color           the color
     * @param backgroundColor the background color
     * @param ranges          the ranges
     * @return the update request
     */
    public static UpdateRequest updateTextProperty(boolean bold, String color, String backgroundColor, Set<DocRange> ranges) {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.updateTextProperty = new DocUpdateTextProperty(bold, color, backgroundColor, ranges);
        return updateRequest;
    }
}
