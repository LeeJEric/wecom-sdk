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

package cn.felord.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * The Gender
 *
 * @author dax
 * @since 2024/10/6
 */
public enum Gender {
    /**
     * 男
     */
    MALE(1),
    /**
     * 女
     */
    FEMALE(2);

    private final int type;

    Gender(int type) {
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
     * Deserialize Gender
     *
     * @param type the type
     * @return the Gender
     */
    @JsonCreator
    public static Gender deserialize(int type) {
        return Arrays.stream(Gender.values())
                .filter(callType -> callType.type == type)
                .findFirst()
                .orElse(null);
    }
}
