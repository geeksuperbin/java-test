package com.xiaobin.test03;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,0,7,4,9,3};
        int[] index = new int[]{0,1,2,3,4,0,5,1,2,6,7};
        // String tel = "";
        // for (int i:index){
        //     tel +=arr[i];
        // }
        StringBuffer tel  = new StringBuffer();
        for (int i:index){
            tel.append(arr[i]);
        }

        System.out.println(tel.toString());
    }
}
