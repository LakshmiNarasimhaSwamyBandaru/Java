import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1=0,f2=1,i=0;
        int f3=0;
        System.out.println("Enter range to find Fibonacci");
        int n = sc.nextInt();
        System.out.println(f1+" "+" ");
        while (i<n){
           f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            i++;
        }



        }


}
