package com.xiaobin.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test9 {
    /*
        需求：
        - 小贾下单并付款的时间为：2020年11月11日 00:03:47
        - 小皮下单并付款的时间为：2020年11月11日 00:10:11
        - 用代码说明这两位同学有没有参见上秒杀活动

        分析
        - 判断下单时间是否在开始到结束的范围内
        - 把字符串形式的时间变成毫秒值
     */

    public static void main(String[] args) throws ParseException {
        String s1 = "2020年11月11日 0:03:47";
        String s2 = "2020年11月11日 0:10:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startTime = sdf.parse("2020年11月11日 0:0:0");
        Date endTime = sdf.parse("2020年11月11日 0:10:0");
//        System.out.println(startTime);

//        long st = startTime.getTime();
//        long et = endTime.getTime();


        Date s1Date = sdf.parse(s1);
        Date s2Date = sdf.parse(s2);

//        long s1D = s1Date.getTime();
//        long s2D = s2Date.getTime();

//
//        if(s1D >= st && s1D <= et){
//            System.out.println("小贾参加上秒杀活动");
//        }else{
//            System.out.println("小贾没参见上秒杀活动");
//        }
//
//        if(s2D >= st && s2D <= et){
//            System.out.println("小皮参加上秒杀活动");
//        }else{
//            System.out.println("小皮没参见上秒杀活动");
//        }

        if(s1Date.after(startTime) && s1Date.before(endTime)){
            System.out.println("小贾参加上秒杀活动");
        }else{
            System.out.println("小贾没参见上秒杀活动");
        }

        if(s2Date.after(startTime) && s2Date.before(endTime)){
            System.out.println("小皮参加上秒杀活动");
        }else{
            System.out.println("小皮没参见上秒杀活动");
        }




    }

}
