package com.kodnest.training.threedarray;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][][]=new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;i++){
                for (int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println("Enter marks of School "+i+"Class "+j+"Student"+k);
                    arr[i][j][k]= sc.nextInt();
                }
            }
        }
        System.out.println("Array contents are.......");
        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                for (int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
