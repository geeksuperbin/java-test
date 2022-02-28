package com.xiaobin.test02;

public class Test02 {

    public static void main(String[] args) {
        Swimming teacher = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游得快");
            }
        };

        Swimming student = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游得更快");
            }
        };

        Swimming sporter = new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员破了纪录");
            }
        };

        goSwimming(teacher);
        goSwimming(student);
        goSwimming(sporter);
    }

    // 定义一个方法，让所有角色进来一起比赛
    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }
}




// 接口充当父类
interface Swimming{
    void swim();
}
