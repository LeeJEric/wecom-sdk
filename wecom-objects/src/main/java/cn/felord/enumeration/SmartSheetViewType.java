package cn.felord.enumeration;

/**
 * 智能表格视图类型
 *
 * @author dax
 * @since 2024/9/2
 */
public enum SmartSheetViewType {

    /**
     * 未知类型视图，传递该值不合法
     */
    VEW_UNKNOWN,
    /**
     * 网格视图
     */
    VIEW_TYPE_GRID,
    /**
     * 看板视图
     */
    VIEW_TYPE_KANBAN,
    /**
     * 画册视图
     */
    VIEW_TYPE_GALLERY,
    /**
     * 甘特视图
     */
    VIEW_TYPE_GANTT,
    /**
     * 日历视图
     */
    VIEW_TYPE_CALENDAR
}
