import java.util.Scanner;

public class NestedIfElse1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a & b values:");
            int a= sc.nextInt();
            int b=sc.nextInt();

            if (a > b) {
                System.out.println("a is greater than b");

                if (b % 2 == 0) {
                    System.out.println("b is even.");
                } else {
                    System.out.println("b is odd.");
                }
            } else {
                System.out.println("a is less than or equal to b");
            }
        }
    }


