package com.xiaobin.test02;

public class Test01 {
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.run();

        // 匿名
        Animal b = new Animal() {
            @Override
            // 重写方法
            public void run() {
                System.out.println("老虎正在跑2");

            }
        };
        b.run();
    }
}

class Tiger extends Animal{
    @Override
    public void run(){
        System.out.println("老虎正在跑");
    }
}


abstract class Animal{
    public abstract void run();
}