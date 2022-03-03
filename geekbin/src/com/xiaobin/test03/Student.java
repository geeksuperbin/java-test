package com.xiaobin.test03;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;

    public Student(){};

    public Student(String name, char sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name  = name;
    }

    public  char getSex(){
        return sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public int getAge(){
        return  age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // @Override
    // public String toString(){
    //     // return "Hello World";
    //     return "name: "+this.name + "\n" +
    //             "sex: "+this.sex + "\n" +
    //             "age: "+this.age;
    // }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    /**
     * 自己写 equals ，自己定义相等规则
     * 两个对象的内容一样就认为是相等的
     * s1.equals(s2)
     * 比较者：s1
     * 被比较者：s2
     * @param o
     * @return
     */
    // @Override
    // public boolean equals(Object o){
    //     // 1、判断 o 是不是学生类型
    //     if(o instanceof Student){
    //         Student s2 = (Student) o;
    //         //2、判断 2 个对象的内容是否一样
    //         if(this.name.equals(s2.name) &&
    //                 this.age == s2.age &&
    //                 this.sex == s2.sex
    //         ){
    //             return  true;
    //         }else{
    //             return  false;
    //         }
    //     }else{
    //         // 学生只能和学生比较，否则结果一定是 false
    //         return false;
    //     }
    //
    // }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }


}
