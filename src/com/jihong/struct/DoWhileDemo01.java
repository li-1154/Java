package com.jihong.struct;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        do {
            sum = sum + a;
            a++;
        }
        while (a <= 100);
        System.out.println(sum);
    }
}
