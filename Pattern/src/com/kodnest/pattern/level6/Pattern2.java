package com.kodnest.pattern.level6;

public class Pattern2 {
    public static void main(String[] args) {
        char ch='A';
        for (int i=1;i<=5;i++){
            for (int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
