package com.jihong.base;

public class Demo08 {
    //示例变量:从属于对象
    String name;
    int age;
    static String name1 = "dadasdad";
    static int age1 = 10;

    public final double PI = 3.1415;

    public Demo08(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getName1() {
        return name1;
    }

    public static int getAge1() {
        return age1;
    }

    //<editor-fold desc="Description">
    public double getPI() {
        return PI;
    }
    //</editor-fold>

    public static void main(String[] args) {
        //i是局部变量 方法{}值作用域
        int i = 1;
        System.out.println(i);
        System.out.println("/br");
        Demo08 demo08 = new Demo08("11",12);
        System.out.println(demo08.name);
        System.out.println(demo08.age);
        System.out.println(name1);
        System.out.println(age1);


        System.out.println(age1);
        System.out.println(demo08.PI);
        //类成员变量 首字母小写 和驼峰
        String lastName;
        //常量都是大写
        final long MAX_VALUE = 2132132131232131231L;
    }

    public void add() {
        System.out.println();
    }
}

