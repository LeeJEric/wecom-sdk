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

package cn.felord.domain.externalcontact;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * The type Tag list.
 *
 * @author dax
 * @since 2024/9/28
 */
@ToString
@Getter
public class TagList {
    private final Set<String> tagList;

    /**
     * Instantiates a new Tag list.
     *
     * @param tagList the tag list
     */
    TagList(Set<String> tagList) {
        this.tagList = tagList;
    }
}
