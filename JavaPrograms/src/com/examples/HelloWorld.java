package com.examples;

import java.util.Scanner;

public class HelloWorld {



    public static void main(String[] args) {

        System.out.println("Hello World");

        Scanner scanner1 = new Scanner(System.in);

        Scanner scanner2 = new Scanner(System.in);

        String soft =scanner1.next();
        int number = scanner2.nextInt();
        System.out.print(soft);
    }
}
