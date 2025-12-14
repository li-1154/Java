package com.jihong.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i < 1000; i++) {
            if(i%5==0)
            {
                System.out.print("i="+i+" ");
//                count++;
//                if (count%3==0)
//                {
//                    System.out.println();
//                }
            }
            if(i%(5*3)==0)
            {
                System.out.println();
            }
        }
    }
}
