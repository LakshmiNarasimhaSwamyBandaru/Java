public class NestedWhile {
    public static void main(String[] args) {
       int outer=8;
        while (outer<=10){
            System.out.println("Outerside"+outer);
           int inner=3;
            while (inner<=8){
                System.out.println("Innerside"+inner);
                inner++;
            }
            outer++;
        }
    }
}
