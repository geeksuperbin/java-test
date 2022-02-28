package com.xiaobin.test02;

public class Test02 {
    // 匿名内部类终极目的是简化代码
    public static void main(String[] args) {
        // 对象回调
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


        goSwimming(teacher);
        goSwimming(student);
        // 将整个对象作为一个参数，和前端好像
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员破了纪录");
            }
        });
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
