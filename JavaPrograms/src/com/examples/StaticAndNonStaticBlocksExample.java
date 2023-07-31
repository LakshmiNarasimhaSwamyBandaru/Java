package com.examples;

public class StaticAndNonStaticBlocksExample {

    {
        System.out.println("Non static Block 1");
    }

    {
        System.out.println("Non static Block 2");
    }

    static{
        System.out.println("static Block 1");
    }

    static{
        System.out.println("static Block 2");
    }

    public static void main(String[] args) {

        StaticAndNonStaticBlocksExample staticAndNonStaticBlocksExample = new StaticAndNonStaticBlocksExample();

    }
}
