package com.jihong.method;

public class Demo06 {
    public static void main(String[] args) {
        long i = (long)f(31);
        System.out.println(i);

    }

    public static  int f(int n){

        if(n==1)
        { 
            return 1;
        }
        else {
            return n*f(n-1);
        }
    }
}
