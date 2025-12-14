package com.jihong.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
            count++;
        }
        System.out.println("总和:"+sum);
        System.out.println("个数总和"+count);
        System.out.println(sum/count);
    }
}
