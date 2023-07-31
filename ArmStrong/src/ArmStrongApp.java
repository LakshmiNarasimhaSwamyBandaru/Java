import java.util.Scanner;

public class ArmStrongApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbner");
        int n= sc.nextInt();
        ArmStrong obj=new ArmStrong();
        obj.Arm(n);
    }
}
