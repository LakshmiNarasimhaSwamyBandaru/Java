import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[10];
        System.out.println("enter the employee name");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("enter employee name"+i);
            arr[i]=sc.next();
        }
        System.out.println("the employee names are....");
        for (int i=0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
