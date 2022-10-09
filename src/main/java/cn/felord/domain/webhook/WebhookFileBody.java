package cn.felord.domain.webhook;

import cn.felord.domain.externalcontact.MediaId;
import cn.felord.enumeration.HookMsgType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Webhook text body.
 *
 * @author n1
 * @since 2021 /6/16 15:02
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class WebhookFileBody extends WebhookBody {
    private MediaId file;

    public WebhookFileBody() {
        super(HookMsgType.FILE);
    }

}
