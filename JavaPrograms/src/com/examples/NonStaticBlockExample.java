package com.examples;

public class NonStaticBlockExample {
    {
        System.out.println("Non static Block 1");
    }

    {
        System.out.println("Non static Block 2");
    }

    public static void main(String[] args) {
        NonStaticBlockExample nonStaticBlockExample = new NonStaticBlockExample();
        NonStaticBlockExample nonStaticBlockExample2 = new NonStaticBlockExample();
    }
}
