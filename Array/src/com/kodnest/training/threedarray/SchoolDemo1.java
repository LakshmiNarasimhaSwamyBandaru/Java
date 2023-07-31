package com.kodnest.training.threedarray;

import java.util.Scanner;

public class SchoolDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1d length");
        int r=scan.nextInt();
        int s=scan.nextInt();
        int t=scan.nextInt();
        int arr[][][]=new int[r][][];
        System.out.println("Enter 2D length for evrey 1D");
        for (int i=0;i<= arr.length-1;i++){
            System.out.println("Enter 2D length for 1D"+i);
            arr[i]=[s][];
        }
        System.out.println("Enter 3D length for 1D and 2D");
        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                System.out.println("Enter 1D length "+i+"2D Length "+j);
                arr[i][j]=[t];
            }
        }
        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;i++){
                for (int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println("Enter marks of School "+i+"Class "+j+"Student"+k);
                    arr[i][j][k]= scan.nextInt();
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
