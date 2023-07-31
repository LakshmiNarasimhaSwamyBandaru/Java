package kodnest;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        Demo d=new Demo();
        d.findPalin(n);
    }
}
