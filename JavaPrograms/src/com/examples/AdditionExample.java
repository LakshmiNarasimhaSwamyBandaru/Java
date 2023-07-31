package com.examples;

public class AdditionExample {
    public static void main(String[] args) {
        int number;
        number = 5;
        System.out.println(number);
        number = number + 2;
        System.out.println(number);
        number = number + 2;
        System.out.println(number);
    AdditionExample.addition(10,20);

    }

    public static int addition(int a, int b){
       int c=a+b;
       System.out.println(c);
       return c;


    }

    public int division(int a, int b){
        int c=a/b;
        return c;

    }

    private int hello(int a, int b){
        int c=a/b;
        return c;

    }

}

