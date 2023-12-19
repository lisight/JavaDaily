package test.task.day13.task03;

import java.util.Calendar;
import java.util.TimeZone;


/**
 * 设计一个获取当前年份，当前月份的DateUtil工具类，使用普通静态工具类设计方式
 */

public class DateUtil {
    private DateUtil(){};

    public static int getYear(){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        return (calendar.get(calendar.YEAR));
    }
    public static int getMONTH(){
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        return (calendar.get(calendar.MONTH)+1);
    }
}
