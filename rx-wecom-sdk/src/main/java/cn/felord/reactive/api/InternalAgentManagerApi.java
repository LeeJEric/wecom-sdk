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

package cn.felord.reactive.api;

import cn.felord.domain.GenericResponse;
import cn.felord.domain.WeComResponse;
import cn.felord.domain.agent.AgentDetailsResponse;
import cn.felord.domain.agent.AgentMenuBtn;
import cn.felord.domain.agent.AgentMenuBtns;
import cn.felord.domain.agent.UserWorkbenchTemplate;
import cn.felord.domain.agent.WorkbenchDetailResponse;
import cn.felord.domain.agent.WorkbenchTemplate;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

/**
 * 应用配置管理.
 *
 * @author felord.cn
 * @since 1.0.0
 */
interface InternalAgentManagerApi {

    /**
     * 获取应用详情
     * <p>
     * 应用ID要和对应的token一致
     *
     * @param agentId the agent id
     * @return the agent details
     */
    @GET("agent/get")
    Single<AgentDetailsResponse> getAgentDetails(@Query("agentid") String agentId);

    /**
     * 设置应用
     *
     * @param settings the settings
     * @return WeComResponse
     */
    @POST("agent/set")
    Single<WeComResponse> settings(@Body AgentManagerApi.Settings settings);

    /**
     * 创建菜单
     *
     * @param agentId the agent id
     * @param request the request
     * @return the we com response @ the weComException
     */
    @POST("menu/create")
    Single<WeComResponse> createMenu(@Query("agentid") String agentId, @Body AgentMenuBtns request);

    /**
     * 获取菜单
     *
     * @param agentId the agent id
     * @return the menu @ the we com exception
     */
    @GET("menu/get")
    Single<GenericResponse<List<AgentMenuBtn>>> getMenu(@Query("agentid") String agentId);

    /**
     * 删除菜单
     *
     * @param agentId the agent id
     * @return the we com response @ the we com exception
     */
    @GET("menu/delete")
    Single<WeComResponse> deleteMenu(@Query("agentid") String agentId);

    /**
     * 设置应用在工作台展示的模版
     * <p>
     * 该接口指定应用自定义模版类型。同时也支持设置企业默认模版数据。若type指定为 "normal" 则为取消自定义模式，改为普通展示模式
     *
     * @param template the template
     * @return the workbench template @ the we com exception
     */
    @POST("agent/set_workbench_template")
    Single<WeComResponse> setWorkbenchTemplate(@Body WorkbenchTemplate template);

    /**
     * 获取应用在工作台展示的模版
     *
     * @param agentId the agent id
     * @return the workbench template @ the we com exception
     */
    @POST("agent/get_workbench_template")
    Single<WorkbenchDetailResponse> getWorkbenchTemplate(@Body Map<String, String> agentId);

    /**
     * 设置应用在用户工作台展示的数据
     * <p>
     * 可设置当前凭证对应的应用；设置的userid必须在应用可见范围；
     * 每个用户每个应用接口限制10次/分钟；
     *
     * @param template the template
     * @return the workbench data @ the we com exception
     */
    @POST("agent/set_workbench_data")
    Single<WeComResponse> setWorkbenchData(@Body UserWorkbenchTemplate template);
}
