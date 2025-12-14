package com.jihong.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;
        while(a<10){
            System.out.println("a "+a);
            a+=2;
        }
        int b = 10;
        for (int i =0;i<b;i++)
        {
            System.out.println("i "+i);
        }
       // 0 ~100奇数和偶数的和
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0)
            {
                count+=i;
            }
            else
            {
                count2+=i;
            }
        }

        System.out.println("count偶数之和"+count);
        System.out.println("count奇数之和 "+count2);
    }
}
