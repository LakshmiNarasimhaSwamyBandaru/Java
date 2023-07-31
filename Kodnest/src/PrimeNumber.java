import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of a number");
        int n=sc.nextInt();
        int count;
        for (int i=1;i<=n;i++){
            count=0;
            for (int j=1;j<=n;j++){
                if(i % j==0){
                    count++;
                }
            }if (count==2){
                System.out.println("the prime numbers are:"+i);
            }
        }
    }
}
