package com.jihong.Array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{4,5},{7,8},{2,3}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr["+i+"]["+j+"]="+arr[i][j] + " ");
            }
        }

    }
}
