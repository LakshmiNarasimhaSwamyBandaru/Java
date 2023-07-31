import java.util.Scanner;

public class MultipleOfTenChecker {
    public static void checkMultipleOfTen(int n,int m) {
        // your code here
        if (n % m == 0) {
            System.out.println("Enter number "+n+" is multipleof "+m);
        }
        else {
            System.out.println("Enter number "+n+ "is not multiple of "+m);

        }
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENter two  numberto check multiple or not");
            int n= sc.nextInt();
            int m= sc.nextInt();
            checkMultipleOfTen(n,m);


    }
}
