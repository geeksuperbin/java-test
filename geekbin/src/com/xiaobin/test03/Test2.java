package com.xiaobin.test03;

/**
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("周",'男',19);
        Student s2 = new Student("周",'男',19);
        // equals 默认比较地址是否相同
        boolean res = s1.equals(s2);
        System.out.println(res);
    }
}
