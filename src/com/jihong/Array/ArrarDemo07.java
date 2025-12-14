package com.jihong.Array;

import java.util.Arrays;

public class ArrarDemo07 {
    public static void main(String[] args) {
        int[] ints = {11,324,5,123,514};
//        int temp =0 ;
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 1; j < ints.length-1; j++) {
//                if (ints[i] > ints[j]) {
//                    temp = ints[i];
//                    ints[i] = ints[j];
//                    ints[j] = temp;
//                }
        sort(ints);
        System.out.println(Arrays.toString(ints));
            }


//
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print(ints[i] + " ");
//        }


    public  static void sort(int[] arr){
        boolean flag = false;
        int temp =0;
        for(int j=0;j<arr.length-1;j++){
            for (int k = j+1;k<arr.length;k++){
                if(arr[j]>arr[k]){
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    flag = true;
                }
            }
        }
    }
}
