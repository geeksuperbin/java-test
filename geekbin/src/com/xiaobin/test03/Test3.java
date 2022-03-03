package com.xiaobin.test03;

import java.util.Objects;

/**
 * 目标：掌握 objects 类的常用方法：
 *
 */
public class Test3 {
    public static void main(String[] args) {
        // String s1 = "geekbin";
        String s1 = null;
        // String s2 = "geekbin";
        String s2 = new String("geekbin");
        // System.out.println(s1.equals(s2)); // 留下隐患，可能出现空指针异常
        System.out.println(Objects.equals(s1,s2)); // 更安全，结果也是对的
    }
}
