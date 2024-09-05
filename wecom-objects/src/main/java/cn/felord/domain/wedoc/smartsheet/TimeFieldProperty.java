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

package cn.felord.domain.wedoc.smartsheet;

import cn.felord.enumeration.DateTimeFieldFormatter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * The type Time field property.
 *
 * @author dax
 * @since 2024 /9/4
 */
@ToString
@Getter
public class TimeFieldProperty {
    private final String format;

    /**
     * Instantiates a new Time field property.
     *
     * @param format the format
     */
    @JsonCreator
    TimeFieldProperty(@JsonProperty("format") String format) {
        this.format = format;
    }

    /**
     * Of time field property.
     *
     * @param formatter the formatter
     * @return the date time field property
     */
    public static TimeFieldProperty of(DateTimeFieldFormatter formatter) {
        return new TimeFieldProperty(formatter.getFormat());
    }
}
