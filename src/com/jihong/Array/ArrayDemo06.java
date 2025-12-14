package com.jihong.Array;

import java.util.Arrays;

public class ArrayDemo06 {
    public  static void main(String[] args) {
        int[] a = {111,2,3,4,5};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println("====================");
        printArray(a);
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            if(i==0){
                System.out.print("[");
            }
            if(i<a.length-1){
                System.out.print(a[i]+", ");
            }

            if(i==a.length-1){
                System.out.print(a[i]+"]");
                System.out.println();
            }
        }
        System.out.println("======================");

    }
}
