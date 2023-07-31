import java.util.Scanner;

public class BooleanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        boolean arr[] = new boolean[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("IS person" + i + "married");
            arr[i] = sc.nextBoolean();
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("IS person" + i + "married" + arr[i]+ " ");

        }
    }
}

