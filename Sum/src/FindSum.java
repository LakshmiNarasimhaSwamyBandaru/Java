import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int res=Sum(n);
        System.out.println(res);
    }
    public static int Sum(int n){
        int sum=0;

        while (n>0) {
            int rem = n % 10;
            sum = sum + rem;
          // System.out.println(sum+" ");//
            n = n / 10;
        }
        return sum;

    }
}
