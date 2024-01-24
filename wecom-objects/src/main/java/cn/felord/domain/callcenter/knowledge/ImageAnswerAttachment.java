/*
 *  Copyright (c) 2023. felord.cn
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package cn.felord.domain.callcenter.knowledge;

import cn.felord.domain.common.MediaId;
import cn.felord.enumeration.AnswerAttachType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Image answer attachment.
 *
 * @author dax
 * @since 2024/10/5
 */
@EqualsAndHashCode(callSuper = true)
@ToString
@Getter
public class ImageAnswerAttachment extends AnswerAttachment {
    private final MediaId image;

    /**
     * Instantiates a new Image answer attachment.
     *
     * @param image the image
     */
    @JsonCreator
    ImageAnswerAttachment(@JsonProperty("image") MediaId image) {
        super(AnswerAttachType.IMAGE);
        this.image = image;
    }

    /**
     * From image answer attachment.
     *
     * @param imageMediaId the image media id
     * @return the image answer attachment
     */
    public static ImageAnswerAttachment from(String imageMediaId) {
        return new ImageAnswerAttachment(new MediaId(imageMediaId));
    }
}
