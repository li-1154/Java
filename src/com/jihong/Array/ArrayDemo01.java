package com.jihong.Array;

import java.util.Arrays;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(a));

        int[] b = new int[21];
        b[0] = 1;
        b[1] = 2;
        System.out.println(b[0]);
        System.out.println(b[20]);
        //1.数组的长度是确定的 一旦创建 大小是不可以改变的
        //2.数组必须是相同类型
        //3.数组可以是任何数据类型
        //4.数组是引用变量
    }
}
