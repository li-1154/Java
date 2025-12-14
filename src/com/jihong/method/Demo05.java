package com.jihong.method;

public class Demo05 {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo05();
        demo05.test();
    }

    //Exception in thread "main" java.lang.StackOverflowError栈溢出
    public  void test()
    {
        test();
    }
}
