package com.jihong.method;

public class Demo02 {
    public static void main(String[] args) {
        int conpaer = conpaer(5, 5);
        System.out.println(conpaer);
        double conp = conpaer(5.1, 5.2);
        System.out.println(conp);
        int sum = add(1,2,5);
        System.out.println(sum);
    }

    public  static  int conpaer(int a,int b){
        return a>b?a:b;
    }

    public  static  int add(int a,int b,int c){
        return a+b+c;
    }

    public  static  double conpaer(double a,double b){
        return a>b?a:b;
    }




}
