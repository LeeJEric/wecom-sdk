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

import cn.felord.enumeration.AnswerAttachType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.ToString;

/**
 * @author dax
 * @since 2023/10/6
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "msgtype", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ImageIntentAttachment.class, name = "image"),
        @JsonSubTypes.Type(value = VideoIntentAttachment.class, name = "video"),
        @JsonSubTypes.Type(value = LinkIntentAttachment.class, name = "link"),
        @JsonSubTypes.Type(value = MiniprogramIntentAttachment.class, name = "miniprogram")
})
@ToString
@Getter
public abstract class IntentAttachment {
    private final AnswerAttachType msgtype;

    IntentAttachment(@JsonProperty("msgtype") AnswerAttachType msgtype) {
        this.msgtype = msgtype;
    }
}
