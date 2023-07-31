import java.util.Scanner;

public class TheTemperatureConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER the temperature");
        double F= sc.nextDouble();
        TemperatureConverter obj=new TemperatureConverter();
        obj.convertFahrenheitToCelsius(F);

    }
}
