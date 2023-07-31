import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the array elements are");
         /*   arr[0]=1000;
            arr[1]=2000;
            arr[2]=3000;
            arr[3]=4000;
            arr[4]=5000;
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" ");
    */
        for (int i=0;i<= arr.length-1;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The array contents are......");
        for (int i=0;i<= arr.length-1;i++){
            System.out.print
                    (arr[i]+" ");
        }
    }
}
