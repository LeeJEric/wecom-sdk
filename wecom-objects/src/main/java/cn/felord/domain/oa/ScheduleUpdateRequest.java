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

package cn.felord.domain.oa;

import cn.felord.enumeration.BoolEnum;
import cn.felord.enumeration.ScheduleOpMode;
import lombok.Data;

import java.time.Instant;

/**
 * The type Schedule update request.
 *
 * @author felord.cn
 * @since 1.0.0
 */
@Data
public class ScheduleUpdateRequest {
    private BoolEnum skipAttendees;
    private ScheduleOpMode opMode;
    private Instant opStartTime;
    private final ScheduleUpdateBody schedule;
}
