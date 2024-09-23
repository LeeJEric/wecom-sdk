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
 * The BookingStatus
 *
 * @author felord
 * @since 2021 /11/23 17:01
 */
public enum BookingStatus {
    /**
     * 已预定
     */
    SCHEDULED(0),
    /**
     * 已取消
     */
    CANCELED(1),

    /**
     * 申请中
     */
    APPLYING(2),
    /**
     * 审批中
     */
    UNDER_APPROVAL(3);

    private final int type;

    BookingStatus(int type) {
        this.type = type;
    }

    /**
     * Deserialize BookingStatus.
     *
     * @param type the type
     * @return the button type
     */
    @JsonCreator
    public static BookingStatus deserialize(int type) {
        return Arrays.stream(BookingStatus.values())
                .filter(answerStatus -> answerStatus.type == type)
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
