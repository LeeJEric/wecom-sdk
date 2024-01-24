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

package cn.felord.domain.wedrive;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * The type File id.
 *
 * @author dax
 * @since 2024/5/24 13:41
 */
@EqualsAndHashCode
@ToString
@Getter
public class FileId {
    private final String fileid;

    /**
     * Instantiates a new File id.
     *
     * @param fileid the fileid
     */
    @JsonCreator
    public FileId(@JsonProperty("fileid") String fileid) {
        this.fileid = fileid;
    }
}
