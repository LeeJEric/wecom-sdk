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

package cn.felord.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * The enum Group chat member type.
 *
 * @author dax
 * @since 2021 /9/8 10:47
 */
public enum GroupChatMemberType {
    /**
     * Corp group chat member type.
     */
    CORP(1),
    /**
     * Personal group chat member type.
     */
    PERSONAL(2);

    private final int type;

    GroupChatMemberType(int type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    @JsonValue
    public int getType() {
        return type;
    }

    /**
     * Deserialize group chat member type.
     *
     * @param type the type
     * @return the group chat member type
     */
    @JsonCreator
    public static GroupChatMemberType deserialize(int type) {
        return Arrays.stream(GroupChatMemberType.values())
                .filter(contactType -> contactType.type == type)
                .findFirst()
                .orElse(null);
    }

}
