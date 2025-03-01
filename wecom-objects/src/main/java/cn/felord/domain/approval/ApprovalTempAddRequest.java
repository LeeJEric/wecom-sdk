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

package cn.felord.domain.approval;

import lombok.Getter;
import lombok.NonNull;

import java.util.Collections;
import java.util.List;

/**
 * The type Approval temp add request.
 *
 * @author dax
 * @since 2023 /5/25
 */
@Getter
public class ApprovalTempAddRequest {
    private final List<ApprovalTitle> templateName;
    private final TemplateContent templateContent;

    /**
     * Instantiates a new Approval temp add request.
     *
     * @param templateName    the template name
     * @param templateContent the template content
     */
    public ApprovalTempAddRequest(List<ApprovalTitle> templateName, TemplateContent templateContent) {
        this.templateName = templateName;
        this.templateContent = templateContent;
    }


    /**
     * From approval temp add request.
     *
     * @param templateName the template name
     * @param controls     the controls
     * @return the approval temp add request
     * @since 1.2.6
     */
    public static ApprovalTempAddRequest from(@NonNull String templateName,
                                              @NonNull List<TmpControl<? extends ControlConfig>> controls) {
        return new ApprovalTempAddRequest(Collections.singletonList(ApprovalTitle.zhCN(templateName)), new TemplateContent(controls));
    }

}
