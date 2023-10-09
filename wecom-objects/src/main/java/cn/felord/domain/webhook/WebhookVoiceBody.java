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

package cn.felord.domain.webhook;

import cn.felord.domain.common.MediaId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * 语音消息
 *
 * @author n1
 * @since 2021 /6/16 15:02
 */
@EqualsAndHashCode(callSuper = true)
@ToString
@Getter
public class WebhookVoiceBody extends WebhookBody {
    private final MediaId voice;

    /**
     * Instantiates a new Webhook voice body.
     *
     * @param voice the voice
     */
    WebhookVoiceBody(MediaId voice) {
        super("voice");
        this.voice = voice;
    }

    /**
     * From webhook voice body.
     *
     * @param voice the voice
     * @return the webhook file body
     */
    public static WebhookVoiceBody from(String voice) {
        return new WebhookVoiceBody(new MediaId(voice));
    }
}
