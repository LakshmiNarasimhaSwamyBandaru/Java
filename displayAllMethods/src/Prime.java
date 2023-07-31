import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("UNtill whwere you need prime");
        int n= sc.nextInt();
        int count=0;
        for (int i=3;i<n;i++){
            int res =checkPrime(i);
            if (res!=0){
                System.out.println(res);
                count++;
            }
        }
        System.out.println("number of primeis = "+count);
    }
    public static int checkPrime(int number){
        for (int i=2;i<number;i++){
            if (number%i==0){
                return 0;
            }

        }
        return number;
    }
}
