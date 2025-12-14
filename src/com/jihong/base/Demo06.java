package com.jihong.base;

public class Demo06 {
    static void main(String[] args) {
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        //计算的时候内存溢出
        int total = money * years;
        System.out.println(total);
        //装换之间已经内存溢出
        long total1 = money * years;
        System.out.println(total1);
        //先把其中一个转换成long
        long total3 = (long)money * years;
        System.out.println(total3);

    }
}
