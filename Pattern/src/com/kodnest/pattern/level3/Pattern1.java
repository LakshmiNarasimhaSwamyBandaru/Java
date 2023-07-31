package com.kodnest.pattern.level3;

public class Pattern1 {
    public static void main(String[] args) {
        int count=0;
        for (int k = 1; k <= 2; k++) {
            count=0;
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }
}
