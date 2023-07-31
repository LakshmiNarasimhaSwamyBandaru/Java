public class NestedDoWhile {
    public static void main(String[] args) {
        int outer=5;
        do {
            System.out.println("Outerside"+outer);
            int inner=4;
            do {
                System.out.println("Innerside"+inner);
                inner++;
            }
            while (inner<=8);

            outer++;

        }
        while (outer<=10);
    }
}
