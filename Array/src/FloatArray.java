import java.util.Scanner;

public class FloatArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float arr[]=new float[10];
        System.out.println("array elements are....");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("enter height of the player"+i);
            arr[i]=sc.nextFloat();
            boolean intrest = true;

        }

        System.out.println("height of the players are....");
        for (int i=0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
