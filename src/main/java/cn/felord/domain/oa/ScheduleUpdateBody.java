package cn.felord.domain.oa;

import lombok.Getter;

import java.time.Instant;

/**
 * @author felord
 * @since 2021/11/21 15:46
 */
@Getter
public class ScheduleUpdateBody extends ScheduleRequestBody {
    private final String scheduleId;

    public ScheduleUpdateBody(String scheduleId, Instant startTime, Instant endTime) {
        super(startTime, endTime);
        this.scheduleId = scheduleId;
    }
}
