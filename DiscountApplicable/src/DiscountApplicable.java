import java.util.Scanner;

public class DiscountApplicable {
    public static void checkDiscount(double purchaseAmount)
    {
        if(purchaseAmount>100){
            System.out.println("Discount Applicable");
        }
        else {
            System.out.println("Discount not Applicable");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        double purchaseAmount=scan.nextDouble();
        checkDiscount(purchaseAmount);
    }
}
