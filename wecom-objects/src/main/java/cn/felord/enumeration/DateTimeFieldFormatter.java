package cn.felord.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * The enum Date time field formatter.
 *
 * @author dax
 * @since 2024 /9/4
 */
public enum DateTimeFieldFormatter {
    /**
     * 2018 年 4 月 20 日
     */
    YYYY_MM_DD_CN("yyyy\"年\"m\"月\"d\"日\""),
    /**
     * 2018-04-20
     */
    YYYY_MM_DD("yyyy-mm-dd"),
    /**
     * 2018/4/20
     */
    YYYY_MM_DD_S("yyyy/m/d"),

    /**
     * 4 月 20 日
     */
    MM_DD_CN("m\"月\"d\"日\""),
    /**
     * 2018 年 4 月 20 日 星期五
     */
    YYYY_MM_DD_W_CN("yyyy\"年\"m\"月\"d\"日\" dddd"),
    /**
     * 2018 年 4 月 20 日 14:00
     */
    YYYY_MM_DD_HH_MM_CN("yyyy\"年\"m\"月\"d\"日\" hh:mm"),
    /**
     * 2018-04-20 14:00
     */
    YYYY_MM_DD_HH_MM("yyyy-mm-dd hh:mm"),
    /**
     * 4/20/2018
     */
    M_D_YYYY("m/d/yyyy"),
    /**
     * 20/4/2018
     */
    D_M_YYYY("m/d/yyyy");
    private final String format;

    DateTimeFieldFormatter(String format) {
        this.format = format;
    }

    /**
     * Gets format.
     *
     * @return the format
     */
    @JsonValue
    public String getFormat() {
        return format;
    }


    /**
     * Deserialize DateTimeFieldFormatter.
     *
     * @param format the format
     * @return the DateTimeFieldFormatter
     */
    @JsonCreator
    public static DateTimeFieldFormatter deserialize(String format) {
        return Arrays.stream(DateTimeFieldFormatter.values())
                .filter(contactType -> contactType.format.equals(format))
                .findFirst()
                .orElse(null);
    }
}
