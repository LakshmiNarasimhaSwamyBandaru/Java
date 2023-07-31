import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Calculator obj=new Calculator();


        System.out.println("Hello user welcome to kodnest calculator");



        System.out.println("+ =====> Addition");
        System.out.println("- =====> subtraction");
        System.out.println("* =====> multiplication" );
        System.out.println("/ =====> Division" );
        System.out.println("% =====> modulus");
        System.out.println("^ =====> Square");
        System.out.println("! =====> To Stop");
        System.out.println("Enter your choice");
        char ch=scan.next().charAt(0);
        switch (ch){
            case '+':obj.add();
            break;
            case '-':obj.sub();
            break;
            case '*':obj.mul();
            break;
            case '/':obj.div();
            break;
            case '%':obj.mod();
            break;
            case '^':obj.squares();
            break;
            case '!':System.out.println("terminate the program");
            break;
            default:
                System.out.println( "please read carefully once in the menu");
        }
    }
}
