import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements");
        char arr[]=new  char[sc.nextInt()];
        for (int i=0;i<= arr.length-1;i++){
            System.out.println("Enter "+arr.length+" Elements store in an array");
            arr[i]= sc.next().charAt(0);
        }
        System.out.println("Array elements are...");
        // Enhanced for loop
        for (char num:arr){
            System.out.print((num)+" ");
        }
        System.out.println();
    }
}
