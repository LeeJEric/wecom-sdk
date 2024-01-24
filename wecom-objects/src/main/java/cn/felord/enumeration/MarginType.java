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
 * 水印密度
 *
 * @author dax
 * @since 2024/7/3 15:28
 */
public enum MarginType {
    /**
     * 稀疏
     */
    SPARSE(1),
    /**
     * 紧密
     */
    TIGHTNESS(2);

    private final int type;

    MarginType(int type) {
        this.type = type;
    }

    /**
     * Deserialize MarginType
     *
     * @param type the type
     * @return the range type
     */
    @JsonCreator
    public static MarginType deserialize(int type) {
        return Arrays.stream(MarginType.values())
                .filter(bankAccountType -> bankAccountType.type == type)
                .findFirst()
                .orElse(null);
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

}
