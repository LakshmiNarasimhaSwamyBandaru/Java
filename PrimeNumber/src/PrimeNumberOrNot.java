import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int count=0;
        for (int i=2;i<=n;i++)
        {
            if(n%2==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime number");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
