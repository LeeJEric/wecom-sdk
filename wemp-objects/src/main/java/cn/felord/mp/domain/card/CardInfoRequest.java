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

package cn.felord.mp.domain.card;

import cn.felord.mp.enumeration.CondSource;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * 免费券数据接口参数
 *
 * @author dax
 * @since 2023 /8/20
 */
@ToString
@Getter
public class CardInfoRequest extends CardBizRequest {
    private final String cardId;

    /**
     * Instantiates a new Card info request.
     *
     * @param beginDate  the begin date
     * @param endDate    the end date
     * @param condSource the cond source
     */
    public CardInfoRequest(LocalDate beginDate, LocalDate endDate, CondSource condSource) {
        this(beginDate, endDate, condSource, null);
    }

    /**
     * Instantiates a new Card info request.
     *
     * @param beginDate  the begin date
     * @param endDate    the end date
     * @param condSource the cond source
     * @param cardId     the card id
     */
    public CardInfoRequest(LocalDate beginDate, LocalDate endDate, CondSource condSource, String cardId) {
        super(beginDate, endDate, condSource);
        this.cardId = cardId;
    }
}
