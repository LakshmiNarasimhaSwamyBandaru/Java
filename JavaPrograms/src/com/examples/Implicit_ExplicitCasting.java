package com.examples;

public class Implicit_ExplicitCasting {
    public static void main(String[] args) {
        byte b = 10; //byte b = (int) 10; Example below compiles because compiler introduces an implicit cast.

        short n1 = 5;
        short n2 = 6;
//short sum = n1 + n2;//COMPILER ERROR
        short sum = (short)(n1 + n2);//Needs an explicit cast

//        byte b = 5;
        b += 5; //Compiles because of implicit conversion

        long value = 100;
        int number = (int) value; //Explicit Casting from long to int
        float f = 100; //Implicit Casting

        int value1= 100;
        long number1 = value; //implicit casting done by compiler from int to long i.e., implicit casting can be done from smaller to larger
        float f2=100; //Implict Casting from int to float number

    }
}
