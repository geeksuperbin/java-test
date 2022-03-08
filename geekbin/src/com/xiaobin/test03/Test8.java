package com.xiaobin.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {
    public static void main(String[] args) throws ParseException {
        /*
            案例
            请计算出 2021 年 08 月 06 日 11 点 11 分 11 秒，往后走 2 天 14 小时 49 分 06 秒后的时间是多少
         */
        String sj = "2021年08月06日 11点11分11秒";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");

        // 解析成日期对象
        Date a = sdf.parse(sj);

        // 时间毫秒值
        long s = a.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;

        // 转成日期对象
//        Date h = new Date(s);

        // 按日期模板转换成指定日期形式
        // 2021年08月09日 02点00分17秒
//        System.out.println(sdf.format(h));
        System.out.println(sdf.format(s));

//        System.out.println(h);



    }
}
