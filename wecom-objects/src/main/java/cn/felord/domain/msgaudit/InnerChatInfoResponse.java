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

package cn.felord.domain.msgaudit;

import cn.felord.domain.WeComResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.List;

/**
 * The type InnerChatInfoResponse
 *
 * @author dax
 * @since 2023 /12/1
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InnerChatInfoResponse extends WeComResponse {

    /**
     * roomid对应的群名称
     */
    private String roomname;
    /**
     * roomid对应的群创建者userid
     */
    private String creator;
    /**
     * roomid对应的群创建时间
     */
    private Instant roomCreateTime;
    /**
     * roomid对应的群公告
     */
    private String notice;
    /**
     * roomid对应的群成员列表
     */
    private List<InnerChatMember> members;
}