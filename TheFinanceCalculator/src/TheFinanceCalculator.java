public class TheFinanceCalculator {
    public static void main(String[] args) {
        FinanceCalculator calculator = new FinanceCalculator();
        double res=calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
        System.out.println(res);
    }
}
