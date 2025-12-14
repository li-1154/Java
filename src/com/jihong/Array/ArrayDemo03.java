package com.jihong.Array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
            System.out.println(array[i]);
        }
        System.out.println("--------------------------");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println(sum);
        System.out.println("===========================");
        int max =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        System.out.println(max);

    }
}
