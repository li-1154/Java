package com.jihong.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入");
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("hello"))
            {
                break;
            }

        }
        sc.close();
    }
}
