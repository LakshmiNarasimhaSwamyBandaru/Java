import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements");
        int arr[]=new  int[sc.nextInt()];
        for (int i=0;i<= arr.length-1;i++){
            System.out.println("Enter "+arr.length+" Elements store in an array");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements are...");
        // Enhanced for loop
        for (int num:arr){
            System.out.print((num+5)+" ");
        }
        System.out.println();
    }
}
