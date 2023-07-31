import java.util.Scanner;

public class VendingMachineSimulator {
    public static void getProduct(String productCode)
    {
        switch (productCode) {
            case "p01":
                System.out.println("Coco Cola");
                break;
            case "p02":
                System.out.println("Mirinda");
                break;
            case "p03":
                System.out.println("Spirit");
                break;
            case "p04":
                System.out.println("7UP");
                break;
            case "p05":
                System.out.println("Maaza");
                break;
            case "p06":
                System.out.println("Bindu Jeera");
                break;
            default:
                System.out.println("paper boat");
                break;
        }
// your code here
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product code");
        String productCode=sc.next();
        getProduct(productCode);
    }
}


