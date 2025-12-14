package com.jihong.base;

class Demo03 {
    public static void main(String[] args) {
        int i = 10;
        int i2 = 010;
        int i3 = 0x11;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //==================================================================
        char c = 'a';
        char c2 = '中';
        char c1 = '\u0061';
        System.out.println(c);
        System.out.println((int)c);
        //强制转换的话 写法是 (类型)对象
        System.out.println((int)c2);
        System.out.println(c1);
        //==================================================================

        String s1 = "hello world!";
        String s2 = "hello world!";
        String s3 = new String("hello world!");
        String s4 = new String("hello world!");
        System.out.print("s1==s2?");
        System.out.println(s1==s2);
        System.out.print("s3==s4?");
        System.out.println(s3==s4);
        //==================================================================
        boolean b = true;
        if (b)
        {
            System.out.println("b");
        }
    }
}
