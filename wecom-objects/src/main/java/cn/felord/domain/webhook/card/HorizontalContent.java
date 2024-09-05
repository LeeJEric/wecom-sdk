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

package cn.felord.domain.webhook.card;

import lombok.Getter;
import lombok.ToString;

/**
 * 二级标题 文本列表
 *
 * @author felord.cn
 * @since 2021/9/3 15:22
 */

@Getter
@ToString
public abstract class HorizontalContent {
    private final HorizontalContentType type;
    private final String keyname;
    private final String value;

    public HorizontalContent(HorizontalContentType type, String keyname, String value) {
        this.type = type;
        this.keyname = keyname;
        this.value = value;
    }
}
