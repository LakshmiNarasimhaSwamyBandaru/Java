import java.util.Scanner;

public class DoubleTrouble {
    public static void main(String[] args) {

        /*int result=doubleTheNumber(15);
        System.out.println(result);

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        int res=doubleTheNumber( num);
        System.out.println(res);


    }
    public static int doubleTheNumber(int num){
        return num*2;
    }
}
