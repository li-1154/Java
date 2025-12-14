package com.jihong.operator;

public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; //a = 2 先赋值 再自增 a=a+1;->之后执行
        System.out.println(a);
        int c = ++a; //a = 3 先自增 再赋值 a=a+1 ->先执行

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //Math数学类 提供多种运算
        double pow = Math.pow(2, 3);
        System.out.println(pow);


    }
}
