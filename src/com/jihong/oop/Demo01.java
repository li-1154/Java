package com.jihong.oop;

//class Demo01 类
public class Demo01 {
    //main 方法
    public static void main(String[] args) {
        sayHello();
        Demo01 d = new Demo01();
        int max = d.max(1, 2);
        System.out.println(max);

        Student s = new Student();
        s.say("1","123");
        Demo01 d1 = new Demo01();
        int max1 = d1.max(1, 2);
        System.out.println(max1);

    }
    //
    public static  void sayHello()
    {
        System.out.println("Hello World");
    }
    public  int max(int a, int b)
    {
        return a>b?a:b;
    }

    public  void  reddFile(String File)
    {
        String readable = IO.readln(File);
        System.out.println(readable);
    }
}
