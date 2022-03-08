package com.xiaobin.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test10 {

    public static void main(String[] args) {
        /*
        日历
        calendar 概述
        calendar 代表了系统此刻日期对应的日历对象
        calendar 是一个抽象类，不能直接创建对象


        java.util.GregorianCalendar[time=1646750132774,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,
        transitions=29,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,
        WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,
        MINUTE=35,SECOND=32,MILLISECOND=774,ZONE_OFFSET=28800000,DST_OFFSET=0]


         */
        // 1. 拿到系统此刻日历对象
        Calendar cal = Calendar.getInstance();

        // 2. 获取日历的信息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

       // 3.修改日历的某个字段信息
       // cal.set(Calendar.YEAR, 2099);
       // System.out.println(cal);

        // 计算 64 天后是哪一天
        cal.add(Calendar.DAY_OF_YEAR, 64);
        // cal.add(Calendar.MINUTE, 59);
        // System.out.println(cal);
        Date d = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(d));

        // 通过日历对象拿到时间毫秒值
        System.out.println(cal.getTimeInMillis());



    }
}
