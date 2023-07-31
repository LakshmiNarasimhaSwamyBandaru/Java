package com.kodnest.pattern.level4;

public class Pattern4 {
    public static void main(String[] args) {
        for (int a=1;a<=5;a++){
            for (int b=1;b<=5;b++){
                System.out.print("#");
            }
            for (int c=1;c<=a;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
