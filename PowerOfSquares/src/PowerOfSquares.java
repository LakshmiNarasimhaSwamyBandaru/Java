import java.util.Scanner;

public class PowerOfSquares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int res=squareNumber( num);
        System.out.println(res);

    }
    public static int squareNumber(int num){
        return num*num;
    }
}
