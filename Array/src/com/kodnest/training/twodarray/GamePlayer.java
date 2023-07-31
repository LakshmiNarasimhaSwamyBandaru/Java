package com.kodnest.training.twodarray;

import java.util.Scanner;

public class GamePlayer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of games");
        int r= sc.nextInt();
        System.out.println("Enter no.of players");
        int c= sc.nextInt();
        float a[][]=new float[r][c];
        for (int i=0;i<= a.length-1;i++){
            for (int j=0;j<=a[i].length-1;j++){
                System.out.println("Enter the no of games "+i+" Player height "+j);
                a[i][j]= sc.nextFloat();
            }
        }
        System.out.println("Array contents are......");
        for (int i=0;i<= a.length-1;i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
