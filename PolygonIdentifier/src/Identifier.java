import java.util.Scanner;

public class Identifier {
    public static void identifyPolygon(int sides) {

        switch(sides) {
            case 3: System.out.println("Triangle");
            break;
            case 4:
            System.out.println("Quadrilateral");
            break;
            case 5:
            System.out.println("Pentagon");
            break;
            case 6:
            System.out.println("Hexagon");
            break;
            case 7:
                System.out.println("Heptagon");
                break;
            case 8:
                System.out.println("Octagon");
                break;// Add more cases as needed
            default: System.out.println("Check once & Enter the sides properly");
            break;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side");
        int sides= sc.nextInt();
        identifyPolygon(sides);
    }
}
