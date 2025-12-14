package com.jihong.struct;

public class BreakDemo {
    public  static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            if (i %10==0)
                continue;
            System.out.println("i "+i);

        }
        System.out.println("121212");
    }
}
