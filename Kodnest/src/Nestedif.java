import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks= sc.nextInt();
        if(marks>=40){
            System.out.println("you pass in the examination ");
            if (marks>60 && marks<100){
                System.out.println("you pass with First Class in the examination ");
                if (marks>75){
                    System.out.println("you pass withDistinction class the examination");
                }
            }
        }
    }
}
