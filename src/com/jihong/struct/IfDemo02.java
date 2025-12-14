package com.jihong.struct;

import java.util.Scanner;

public class IfDemo02 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = n<60?"不及格":n == 60?"及格":n < 70?"中等!":n < 90?"良好":"优秀";
        System.out.println(a);
//        if (n < 60) {
//            System.out.println("不及格!");
//        }
//        else if (n == 60) {
//            System.out.println("及格!");
//        }
//        else if (n < 70) {
//            System.out.println("中等!");
//        }
//        else  if (n < 90) {
//            System.out.println("良好");
//        }
//        else
//        {
//            System.out.println("优秀");
//        }

    }
}
