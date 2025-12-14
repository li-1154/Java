package com.jihong.Array;

public class Demo02 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = i;
            System.out.println(nums[i]);
        }
        //ArrayIndexOutOfBoundsException下标越界
        System.out.println(nums[11]);
    }
}
