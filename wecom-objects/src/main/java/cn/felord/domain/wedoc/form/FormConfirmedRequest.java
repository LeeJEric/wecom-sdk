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

package cn.felord.domain.wedoc.form;

import lombok.Data;

import java.time.Instant;

/**
 * The type Form confirmed request.
 *
 * @author dax
 * @since 2023 /3/16 13:42
 */
@Data
public class FormConfirmedRequest {
    private final String repeatedId;
    private final Integer reqType = 2;
    private final Instant startTime;
    private final Instant endTime;
    private final Integer limit;
    private Long cursor;
}
