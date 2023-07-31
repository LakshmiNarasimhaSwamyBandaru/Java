package SumOfNNAturalNumbers;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n= sc.nextInt();
       /* int sum=0;
        for (int i=0;i<=n;i++){
            sum=sum+i;
        }*/
        System.out.println(n*(n+1)/2);
    }
}
