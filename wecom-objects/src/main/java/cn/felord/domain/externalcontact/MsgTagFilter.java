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

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 要进行群发的客户标签列表
 * <p>
 * 同组标签之间按或关系进行筛选，
 * 不同组标签按且关系筛选，
 * 每组最多指定100个标签，支持规则组标签
 *
 * @author dax
 * @since 2023 /9/28
 */
@ToString
@Getter
public class MsgTagFilter {
    private final List<TagList> groupList;

    /**
     * Instantiates a new Msg tag filter.
     *
     * @param groupList the group list
     */
    MsgTagFilter(List<Set<String>> groupList) {
        this.groupList = groupList.stream()
                .map(TagList::new)
                .collect(Collectors.toList());
    }
}
