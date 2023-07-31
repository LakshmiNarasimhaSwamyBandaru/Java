import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Elements");
        int arr[]=new int[sc.nextInt()];
        for (int i=0;i<= arr.length-1;i++){
            System.out.println("Enter"+arr.length+"elements to store in array");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array Elements are......");
       // for (int i=0;i<= arr.length-1;i++){
         //   System.out.print(arr[i]+" ");
        //}
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
