import java.util.Scanner;

public class HalveIt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double num=sc.nextDouble();
        double output=halveTheNumber( num);
        System.out.println(output);

    }
    public static double halveTheNumber(double num){
        double res=num/2.0;
        return res;
    }
}
