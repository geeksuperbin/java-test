package com.xiaobin.test03;

/**
 * 需求：
 * 设计一个方法用于输出任意整型数组的内容，要求输出成如下格式
 * “该数组内容为：[11,22,33,44,55]”
 */
public class Test5 {

    public static void main(String[] args){
        int[] a = {11,22,33,44,55};
        System.out.println(zhengxin(a));
    }

    public static String zhengxin(int[] a){
        StringBuilder sb = new StringBuilder();
        sb.append("该数组内容为：[");
        for (int i = 0; i < a.length; i++) {
            if(i == a.length -1){
                sb.append(a[i]);
            }else{
                sb.append(a[i]).append(",");

            }
        }
        sb.append("]");
        return sb.toString();
    }

}
