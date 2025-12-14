package com.jihong.scanner;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("检测用户输入");
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println("用户输入的是");
            System.out.println(s);
        }
        sc.close();
    }

}
