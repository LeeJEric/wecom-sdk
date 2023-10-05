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

import cn.felord.domain.externalcontact.ContentText;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * The type Intent answer.
 *
 * @author dax
 * @since 2023 /10/5
 */
@ToString
@Getter
public class IntentAnswer {
    private final ContentText text;
    private final List<? extends IntentAttachment> attachments;

    /**
     * Instantiates a new Intent answer.
     *
     * @param text        the text
     * @param attachments the attachments
     */
    @JsonCreator
    IntentAnswer(@JsonProperty("text") ContentText text,
                 @JsonProperty("attachments") List<? extends IntentAttachment> attachments) {
        this.text = text;
        this.attachments = attachments;
    }
}
