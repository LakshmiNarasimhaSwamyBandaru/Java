package com.kodnest.pattern.level3;

public class Pattern3 {
    public static void main(String[] args) {
        for (int k = 5; k >= 1; k--) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k<=5; k++) {
            for (int j = 5; j>=k; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
