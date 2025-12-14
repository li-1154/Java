package com.jihong.method;

public class Demo04 {
    public  static void main(String[] args) {

        Demo04 obj = new Demo04();
        int add = obj.max(1, 2, 3, 4, 5, 6);
        int add1 = obj.add(1,2);
        int add2 = obj.add(1);
        System.out.println(add);
        System.out.println(add1);
        System.out.println(add2);


    }

    public int add(int ...ints)
    {
        int sum=0;
        for (int anInt : ints) {
            sum+=anInt;
        }
//        for (int i=0;i<ints.length;i++)
//        {
//            sum+=ints[i];
//        }
        return sum;
    }

    public int max(int ...ints)
    {
        int max=0;
        for (int anInt : ints) {
            if (anInt > max) {
                max=anInt;
            }
        }
        return max;

    }

}
