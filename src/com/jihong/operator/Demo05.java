package com.jihong.operator;

public class Demo05 {
    static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b)); //两者为真才是真 前着为假 不用执行后面 直接返回
        System.out.println("a || b: " + (a || b)); //一个为真 结果是真
        System.out.println("!a: " + (!a)); //取反

        int c = 5;
        boolean d = (c < 5) && (c++ < 4);
        System.out.println(d);
        System.out.println(c);
        System.out.println("==================================");
        System.out.println(2 << 3);
        //0000 0000 0
        //0000 0001 1
        //0000 0010 2
        //0000 0011 3
        //0000 0100 4
        //0000 0101 5
        //0000 0110 6
        //0000 0111 7
        //0000 1000 8


        System.out.println("==================================");
        int a1 = 1;
        int b2 = 2;
        a1 += b2;
        b2 += a1;
        System.out.println(a1);
        System.out.println("=============3元运算符========");
        //x?y:z
        System.out.println(3 > 4 ? 3 : 4);
        int score = 80;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println(type);
        System.out.println("==================================");

    }
}
