import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Test obj=new Test();
        obj.divisible2(n);
        obj.divisible3(n);
        obj.divisible5(n);
        obj.divisible5wth3(n);
        obj.odd(n);
        obj.prime(n);
        obj.allEven(n);
        obj.divisible2and5(n);
        obj.oddwith5(n);
        obj.numbersdivisiblebyeven3(n);
    }
}
