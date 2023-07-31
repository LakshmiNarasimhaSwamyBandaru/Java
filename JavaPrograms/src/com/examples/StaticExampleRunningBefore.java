package com.examples;

public class StaticExampleRunningBefore {

    //static block executed once when class loads during runtime
    static {
        System.out.println("Static Block 1 executes before main method");

    }

    static {
        System.out.println("Static Block 2 executes before main method");

    }

    public static void main(String[] args) {
        System.out.println("Main method runs after static block");

    }
}
