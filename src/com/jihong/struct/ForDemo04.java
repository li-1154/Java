package com.jihong.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : numbers) {
            System.out.print(number+"\t");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"\t");
        }
    }
}
