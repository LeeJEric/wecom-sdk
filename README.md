<div align="center" style="margin-bottom: 10px">
    <a target="_blank" href="https://mvnrepository.com/artifact/cn.felord/wecom-sdk">
     	<img src="logo.svg" height="50%" width="50%" alt="wecom-sdk"/>
    </a>
</div>
<p align="center">
    <a target="_blank" href="https://github.com/NotFound403/wecom-sdk/blob/release/LICENSE">
     	<img alt="" src="https://img.shields.io/github/license/NotFound403/wecom-sdk"/>
    </a>
    <a target="_blank" href="https://felord.cn">
     	<img alt="" src="https://img.shields.io/badge/java-8+-red"/>
    </a>   
    <a target="_blank" href="https://github.com/square/retrofit">
     	<img alt="" src="https://img.shields.io/badge/retrofit-2-brightgreen"/>
    </a>   
    <a target="_blank" href="https://mvnrepository.com/artifact/cn.felord/wecom-sdk">
     	<img alt="" src="https://img.shields.io/maven-central/v/cn.felord/wecom-sdk.svg?style=flat-square"/>
    </a>   
    <a target="_blank" href="https://github.com/NotFound403/wecom-sdk">
     	<img alt="" src="https://img.shields.io/github/stars/NotFound403/wecom-sdk?style=social"/>
    </a>    
    <a target="_blank" href="https://gitee.com/felord/wecom-sdk/stargazers">
     	<img alt="" src="https://gitee.com/felord/wecom-sdk/badge/star.svg?theme=white"/>
    </a>    
    <a target="_blank" href="https://work.weixin.qq.com/kfid/kfc9d9d759f27f087e1">
     	<img alt="点击立即微信咨询" src="https://img.shields.io/badge/%E7%82%B9%E5%87%BB-%E5%BE%AE%E4%BF%A1%E5%92%A8%E8%AF%A2-brightgreen"/>
    </a>    
    <a target="_blank" href="http://qm.qq.com/cgi-bin/qm/qr?_wv=1027&k=jteebwBcvUDnEIjP6Kef3HfucjoJtk3h&authKey=%2F6P%2FtQ6TOYDO1iRmtCcqNm4dMOXdqWHQ91cuNt9V3XtDy78orcy8cUlpOhwv3yCG&noverify=0&group_code=4390822">
     	<img alt="点击加入QQ交流群" src="https://img.shields.io/badge/QQ%E4%BA%A4%E6%B5%81%E7%BE%A4-4390822-ff69b4"/>
    </a>
</p>


<p align="center">📢如果你感觉这个项目不错，请点击项目右上角的⭐以鼓励作者，谢谢🎉。</p>

## 🏆简介

[wecom-sdk](https://gitee.com/felord/wecom-sdk)是开源的企业微信开放 API 的 Java 实现，是目前最完整的 Java
开源实现。经过近三年的迭代，目前已经实现了通讯录管理、客户管理、微信客服、素材管理、消息推送、企微机器人、身份验证、应用管理、OA
办公、企业支付等企业微信开放接口，开发人员不需要很高的学习成本就能快速优雅地接入企业微信。

企微机器人样例

```java

/**
 * 企微机器人
 *
 * @throws IOException the io exception
 */
@Test
    void webHooks()throws IOException{
            // 发 markdown
            WebhookBody markdownBody=WebhookMarkdownBody.from("这里为markdown消息");
            // 发纯文本
            WebhookBody textBody=WebhookTextBody.from("这里为纯文本");
            // 发图文
            WebhookArticle article=new WebhookArticle("这里为标题","这里为图文链接")
            .picurl("这里为封面图链接")
            .description("这里为摘要信息");
            WebhookBody newsBody=WebhookNewsBody.from(Collections.singletonList(article));
            //  从base64发图片
            String base64="图片base64";
            String md5="图片base64的md5";
            WebhookBody imageBody1=WebhookImageBody.from(base64,md5);
            //  从流发送图片
            String path="C:\\Users\\Administrator\\Desktop\\0.png";
            InputStream inputStream=Files.newInputStream(Paths.get(path));
            WebhookBody imageBody2=WebhookImageBody.from(inputStream);
            WeComResponse weComResponse=WorkWeChatApi.webhookApi().send("机器人key",markdownBody);
            Assertions.assertTrue(weComResponse.isSuccessful());
            }

```

>
更多示例参见 [SpringBootWecomSdkTests.java](https://gitee.com/felord/wecom-sdk/blob/release/samples/spring-boot-sample/src/test/java/cn/felord/wecom/SpringBootWecomSdkTests.java)

## 🔥特性

- 支持多个企业微信同时配置作业
- 集成方便，适用于各种 Java 生态
- 目前实现企业微信接口**200**多个，能满足大部分场景的需求
- 全参数封装，参数高度语义化封装，再也不担心组织参数、解析参数的问题
- 实现统一回调，所有回调事件可集中异步处理，开发者只需要关心业务逻辑的处理
- 统一异常处理，企业微信API调用异常统一被WeComException管理
- 由 SDK 接管 Token 生命周期，开发者无需关心 Token 的管理。

> 💡目前自建应用可轻松适配，服务商、代开发暂不开源。

## ✍️技术栈

- OkHttp4
- Retrofit2
- Rxjava3
- Jackson2
- XStream

## 🕸️Maven中央仓库坐标

- 普通版本

```xml

<dependency>
  <groupId>cn.felord</groupId>
  <artifactId>wecom-sdk</artifactId>
  <version>1.2.2</version>
</dependency>
```

- rxjava 版本

```xml

<dependency>
  <groupId>cn.felord</groupId>
  <artifactId>rx-wecom-sdk</artifactId>
  <version>1.2.2</version>
</dependency>
```

## 📚入门

**Spring Boot 示例**
参见 [samples/spring-boot-sample](https://gitee.com/felord/wecom-sdk/tree/release/samples/spring-boot-sample)。
> 相关概念请参考[QUICKSTART](QUICKSTART.md)

## 📱微信扫码加入交流群

<div align="center" style="margin-bottom: 10px">
    <img src="contact_me_qr.png" height="30%" width="30%" alt="微信扫码入群"/>
</div>

## 🏗️API实现进度

进度说明：

- [x] 已全部实现
- [ ] 未实现或者部分实现

### 基础

- [x] 账号ID
- [x] 通讯录管理
- [x] 身份验证
- [ ] 企业互联
- [ ] 上下游
- [x] 安全管理
- [x] 消息推送
- [x] 应用管理
- [x] 素材管理
- [x] 电子发票

### 连接微信

- [x] 客户联系
- [x] 微信客服
- [x] 企业支付
- [x] 小程序接入对外收款
- [ ] 会话内容存档
- [ ] 家校沟通
- [ ] 家校应用
- [ ] 政民沟通

### 办公

- [ ] 邮件
- [ ] 文档
  - [ ] 编辑文档
  - [ ] 获取文档数据
- [x] 日程
- [ ] 会议
- [ ] 微盘
- [ ] 直播
- [x] 公费电话
- [x] 打卡
- [x] 审批
- [ ] 汇报
- [x] 人事助手
- [ ] 会议室
- [x] 紧急通知应用

## 🎉特别鸣谢

<div align="center" style="margin-bottom: 10px">
    <a target="_blank" href="https://www.jetbrains.com/">
     	<img src="jb_beam.png" height="200" width="200" alt="jetbrains"/>
    </a>
</div>

