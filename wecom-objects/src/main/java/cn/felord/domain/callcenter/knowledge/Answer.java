/*
 * Copyright (c) 2024. felord.cn
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *       https://www.apache.org/licenses/LICENSE-2.0
 * Website:
 *       https://felord.cn
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.felord.domain.callcenter.knowledge;

import cn.felord.domain.externalcontact.ContentText;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Answer.
 *
 * @author dax
 * @since 2024/10/5
 */
@ToString
@Getter
public class Answer {
    private final ContentText text;
    private final List<? extends AnswerAttachment> attachments;


    /**
     * Instantiates a new Answer.
     *
     * @param content the content
     */
    public Answer(String content) {
        this(content, null);
    }

    /**
     * Instantiates a new Answer.
     *
     * @param content     the content
     * @param attachments the attachments
     */
    public Answer(String content, List<? extends AnswerAttachment> attachments) {
        this(new ContentText(content), attachments);
    }

    /**
     * Instantiates a new Answer.
     *
     * @param text        the text
     * @param attachments the attachments
     */
    @JsonCreator
    Answer(@JsonProperty("text") ContentText text,
           @JsonProperty("attachments") List<? extends AnswerAttachment> attachments) {
        this.text = text;
        this.attachments = attachments;
    }
}
