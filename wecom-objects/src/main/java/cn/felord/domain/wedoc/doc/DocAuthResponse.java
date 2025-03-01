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

package cn.felord.domain.wedoc.doc;

import cn.felord.domain.WeComResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author felord
 * @since 2021/10/12 16:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DocAuthResponse extends WeComResponse {
    private AccessRule accessRule;
    private SecureSetting secureSetting;
    private List<DocMemberListItem> docMemberList;
    private List<CoAuthListItem> coAuthList;
}
