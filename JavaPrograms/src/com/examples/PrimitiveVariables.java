package com.examples;

public  class PrimitiveVariables {

    public int substraction(int a, int b){
        int c=a-b;

        PrimitiveVariables.multiplication(10,5);//calling directly or with the help of class Name static methods inside non static method // This one using className
        multiplication(87944,5);//Directly calling static method inside non static method. It is directly accessable because present in same class
        nonStaticMethod(10,15)  ;

        return c;

    }

    public static void main(String[] args) {


        int invalid = 01;
        int hexa = 0x10;
        System.out.println(hexa);
        int i = 15;
        long longValue = 1000000;
        byte b = (byte)254;

        float f = 26.012f;
        double d = 123.567;
        boolean isDone = true;
        boolean isGood = false;
        char ch = 'a';
        char ch2 = ';';
//        System.out.println(i);
//        System.out.println(d);
        PrimitiveVariables object= new PrimitiveVariables();
//        PrimitiveVariables object1 = object;
        object.substraction(10,5); //substraction is an non static method so we need to create an object of and need to call method substaraction
        PrimitiveVariables.multiplication(5,10); //multiplication is  static method, so we can directly call from static method
        object.multiplication(5,10); //We can access static method with an object, but not preferred i.e., Generally we don't prefer because static method or variable refers to Class
        AdditionExample.addition(10,5); // calling static addition method by using class name AdditionExample
        AdditionExample additionExample = new AdditionExample();
        additionExample.division(10,5); // Non static method present in Addition Example , so need to create an Object for related class and then with the help for object we need to call non static method



        String s= new String("4");
        int z =(int) 4;

        int x = Integer.parseInt("54");
        int a=10; b=5;
        int c = object.substraction(a,b);
//        System.out.println(c);

        String subbu = new String("MY name is subbu");
        String subbu1 = "MY name is subbu";
        String subbu2 = "MY name is subbu";
        String subbu3 = "MY name is subbu";
        System.out.println(subbu.equals(subbu1));
        System.out.println(subbu1==subbu2);
    }



    public static int multiplication(int a, int b){
        int c=a*b;
        return c;

    }

    public  int nonStaticMethod(int a, int b){
        int c=a*b;
        return c;

    }
    static{
        int a=100;
    }




}
