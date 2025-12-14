package com.jihong.base;

public class Demo04 {
    public static void main(String[] args) {
            int i = 128;
            byte b = (byte) i;
            //强转 (类型)变量名 高->低
        System.out.println(i);
        System.out.println(b);
        System.out.println("====================================");
        //类型装换 低到高
        //byte,short,char->int->long->float->double
        /*
        1 不能对布尔值装换
        2 不能把对象类型装换成不相关的类型
        3 高精度转换成低精度 会存在精度丢失问题
        4 高精度转为低精度 也有可能存在内存溢出问题
         */
        byte b1 = 125;
        short s = 11;
        char c = 'a';
        int i1 = 14;
        long l1 = 11L;
        float f1 = 12.3f;
        double d1 = 12.3d;

        System.out.println((int)c);
        System.out.println();

        System.out.println("====================================");
        //二、自动类型转换（隐式）
        //byte → short → int → long → float → double

        int a1 = 10;
        long b2 = a1;     // ✅ 自动
        double c1 = b2;   // ✅ 自动
        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c1);
        System.out.println("====================================");
        //强制类型转换（显式）
        double d = 3.14;
        int i2 = (int) d;  // ✅ 必须强转
        System.out.println(d);
        System.out.println(i2);
    //是否需要强制转换，取决于：有没有“丢失精度 / 范围溢出”的风险，而不是简单的高或低
        //1.int → byte（虽然都是整数）
        int x = 100;
        byte b21 = (byte) x;  // 必须强转
        System.out.println(b21);
        //2 long->int
        long l = 100l;
        int i12 = (int) l;
        System.out.println(i12);
        //float->int
        float f = 5.9f;
        int i5  = (int)f;
        System.out.println(i5);

    }
}
