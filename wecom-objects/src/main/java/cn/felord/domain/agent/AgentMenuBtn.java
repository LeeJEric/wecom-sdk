package cn.felord.domain.agent;

import cn.felord.enumeration.AgentMenuBtnType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * 一级菜单项
 *
 * @author dax
 * @since 2022 /10/25
 */
@ToString
@Getter
public class AgentMenuBtn {
    private final String name;
    private final AgentMenuBtnType type;
    private final String key;
    private final String url;
    private final String pagepath;
    private final String appid;
    private final List<SubAgentMenuBtn> subButton;


    /**
     * Instantiates a new Agent menu btn.
     *
     * @param name     the name
     * @param type     the type
     * @param key      the key
     * @param url      the url
     * @param pagepath the pagepath
     * @param appid    the appid
     */
    AgentMenuBtn(String name, AgentMenuBtnType type, String key, String url, String pagepath, String appid) {
        this(name, type, key, url, pagepath, appid, null);
    }

    /**
     * Instantiates a new Agent menu btn.
     *
     * @param name      the name
     * @param type      the type
     * @param key       the key
     * @param url       the url
     * @param pagepath  the pagepath
     * @param appid     the appid
     * @param subButton the sub button
     */
    @JsonCreator
    AgentMenuBtn(@JsonProperty("name") String name,
                 @JsonProperty("type") AgentMenuBtnType type,
                 @JsonProperty("key") String key,
                 @JsonProperty("url") String url,
                 @JsonProperty("pagepath") String pagepath,
                 @JsonProperty("appid") String appid,
                 @JsonProperty("sub_button") List<SubAgentMenuBtn> subButton) {
        this.name = name;
        this.type = type;
        this.key = key;
        this.url = url;
        this.pagepath = pagepath;
        this.appid = appid;
        this.subButton = subButton;
    }


    /**
     * 点击推事件
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn click(String name, String key) {
        return common(name, AgentMenuBtnType.CLICK, key);
    }

    /**
     * 扫码推事件
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn scancodePush(String name, String key) {
        return common(name, AgentMenuBtnType.SCANCODE_PUSH, key);
    }

    /**
     * 扫码推事件 且弹出“消息接收中”提示框
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn scancodeWaitmsg(String name, String key) {
        return common(name, AgentMenuBtnType.SCANCODE_WAITMSG, key);
    }

    /**
     * 弹出系统拍照发图
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn picSysphoto(String name, String key) {
        return common(name, AgentMenuBtnType.PIC_SYSPHOTO, key);
    }

    /**
     * 弹出拍照或者相册发图
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn picPhotoOrAlbum(String name, String key) {
        return common(name, AgentMenuBtnType.PIC_PHOTO_OR_ALBUM, key);
    }

    /**
     * 弹出企业微信相册发图器
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn picWeixin(String name, String key) {
        return common(name, AgentMenuBtnType.PIC_WEIXIN, key);
    }

    /**
     * 弹出地理位置选择器
     *
     * @param name the name
     * @param key  the key
     * @return the agent menu btn
     */
    public static AgentMenuBtn locationSelect(String name, String key) {
        return common(name, AgentMenuBtnType.LOCATION_SELECT, key);
    }

    /**
     * 跳转URL
     *
     * @param name the name
     * @param url  the url
     * @return the agent menu btn
     */
    public static AgentMenuBtn view(String name, String url) {
        return new AgentMenuBtn(name, AgentMenuBtnType.VIEW, null, url, null, null);
    }

    /**
     * 跳转到小程序
     *
     * @param name     the name
     * @param pagepath the pagepath
     * @param appid    the appid
     * @return the agent menu btn
     */
    public static AgentMenuBtn miniprogram(String name, String pagepath, String appid) {
        return new AgentMenuBtn(name, AgentMenuBtnType.VIEW_MINIPROGRAM, null, null, pagepath, appid);
    }

    private static AgentMenuBtn common(String name, AgentMenuBtnType type, String key) {
        return new AgentMenuBtn(name, type, key, null, null, null);
    }

    /**
     * 菜单组
     *
     * @param name      the name
     * @param subButton the sub button
     * @return the agent menu btn
     */
    public static AgentMenuBtn group(String name, List<SubAgentMenuBtn> subButton) {
        return new AgentMenuBtn(name, null, null, null, null, null, subButton);
    }

}
