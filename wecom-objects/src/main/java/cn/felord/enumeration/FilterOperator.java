package cn.felord.enumeration;

/**
 * 筛选值判断操作类型
 *
 * @author dax
 * @since 2024 /9/2
 */
public enum FilterOperator {

    /**
     * 未知
     */
    OPERATOR_UNKNOWN,

    /**
     * 等于
     */
    OPERATOR_IS,

    /**
     * 不等于
     */
    OPERATOR_IS_NOT,

    /**
     * 包含
     */
    OPERATOR_CONTAINS,

    /**
     * 不包含
     */
    OPERATOR_DOES_NOT_CONTAIN,

    /**
     * 大于
     */
    OPERATOR_IS_GREATER,

    /**
     * 大于或等于
     */
    OPERATOR_IS_GREATER_OR_EQUAL,

    /**
     * 小于
     */
    OPERATOR_IS_LESS,

    /**
     * 小于或等于
     */
    OPERATOR_IS_LESS_OR_EQUAL,

    /**
     * 为空
     */
    OPERATOR_IS_EMPTY,
    /**
     * 不为空
     */
    OPERATOR_IS_NOT_EMPTY
}
