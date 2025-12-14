package com.jihong.struct;

public class WhileDemo01 {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
        while(a<=100){
            sum=sum+a;
            a++;

            System.out.println(a);
        }
        System.out.println(sum);
    }
}
