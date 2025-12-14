package com.jihong.struct;

public class ForDemmo03 {
    public static void main(String[] args) {
        // 99 乘法表
        //我们先打印第一列
        //固定的一列在用一个循环包起来
        //去掉重复
        //调整样式

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"=" + i * j + "\t");

            }
            System.out.println();

        }
    }
}
