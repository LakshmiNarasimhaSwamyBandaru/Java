import java.util.Scanner;

public class ShortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        byte n= sc.nextByte();
        short arr[]=new short[n];

        for (int i=0;i<= arr.length-1;i++){
            System.out.println("enter emplyee age"+i);
            arr[i]= sc.nextShort();
        }
        for (int i=0;i<= arr.length-1;i++){
            System.out.println(" emplyee age"+i+" "+arr[i]+" ");

        }
    }
}
