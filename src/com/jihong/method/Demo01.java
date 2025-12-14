package com.jihong.method;

public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        //3,4 是实际餐食
        int add = demo01.add(3, 4);
        System.out.println(add);
        say();
    }

    public int add(int a, int b)
    {
        return a+b;
    }
    //修饰符 返回值类型 方法名  参数
    //形参 定义用的 不是实际的值
    //实参  传值用的  实际参数
    //有返回值的 方法体必须要写return
    public static void  say()
    {
        //方法体
        System.out.println("hello");
    }
}
