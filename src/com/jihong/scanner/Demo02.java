package com.jihong.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        while (true) {
            if (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);
                if (s.equals("ok")) {
                    break;
                }
            }
        }
        sc.close();
    }
}
