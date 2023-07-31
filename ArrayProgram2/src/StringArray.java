import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements");
        String arr[]=new String[sc.nextInt()];
        for (int i=0;i<= arr.length-1;i++){
            System.out.println("Enter "+arr.length+" Elements store in an array");
            arr[i]= sc.next();
        }
        System.out.println("Array elements are...");
        // Enhanced for loop
        for (String num:arr){
            System.out.print((num)+" ");
        }
        System.out.println();
    }
}
