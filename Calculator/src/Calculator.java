import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    Scanner sc=new Scanner(System.in);
    public void add() {
        System.out.println("enter the two numbers for Addition;");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Addition of a and b is"+" "+(a+b));
    }

    public void sub() {
        System.out.println("enter the two numbers for Subtraction;");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Subtraction of a and b is"+" "+(a-b));
    }

    public void mul() {
        System.out.println("enter the two numbers for multiplication;");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("multiplication of a and b is"+" "+(a*b));
    }

    public void div() {
        System.out.println("enter the two numbers for Division;");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Division of a and b is"+" "+(a/b));
    }

    public void mod() {
        System.out.println("enter the two numbers for Remainder;");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Remainder of a and b is"+" "+(a%b));
    }

    public void squares() {
        int a=sc.nextInt();

        System.out.println("squares of a and b is"+" "+(a*a));
    }
}

