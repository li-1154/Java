package com.jihong.Array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5,6,7,8,9,10};
//        for (int i : array) {
//            System.out.println(i);
//        }
        printArray(array);
        System.out.println("======================================");
        int[] ints = Array1(array);

        printArray(ints);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
    //反转
    public static int[] Array1(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[array.length-1-i] = array[i];
        }
          return result;
    }
}
