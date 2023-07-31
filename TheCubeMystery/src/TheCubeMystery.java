import java.util.Scanner;

public class TheCubeMystery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int res=cubeNumber( num);
        System.out.println(res);

    }
    public static int cubeNumber(int num){
        return num*num*num;
    }
}
