package com.jihong.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数");
        if(sc.hasNextInt()){
            int nextInt = sc.nextInt();
            System.out.println(nextInt);
        }
        else
        {
            System.out.println("输入的不是整数");
        }
        System.out.println("请输入");
        if(sc.hasNextFloat()){
            float nextFloat = sc.nextFloat();
            System.out.println(nextFloat);
        }
        else
        {
            System.out.println("输入的不是小数");
        }

    }
}
