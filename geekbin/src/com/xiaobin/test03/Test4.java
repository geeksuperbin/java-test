package com.xiaobin.test03;

/**
 * 目标：学会使用 StringBuilder 操作字符串
 * 最终还需要知道性能好的原因
 *
 */
public class Test4 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        a.append("geekbin");
        a.append("我爱你 中国");
        a.append("ss").append("ddd");


        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.toString());
        System.out.println(a.reverse()); // 反转

    }
}














