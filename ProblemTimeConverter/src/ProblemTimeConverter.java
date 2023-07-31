import java.util.Scanner;

public class ProblemTimeConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minutes");
        int minutes= sc.nextInt();
        double res=convertToHours( minutes);
        System.out.println(res);


    }
    public static double convertToHours(int minutes){
        double Hours=minutes/60.0;
        return Hours;
    }
}
