package com.kodnest.pattern.level4;

public class Pattern1 {
    public static void main(String[] args) {
        //no.of lines
        for (int k=1;k<=2;k++){
            //no.of $'s
            for (int l=1;l<=5;l++) {
                System.out.print("$");
            }
            //no.of *'s
                for (int m = 1; m <= 5; m++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
