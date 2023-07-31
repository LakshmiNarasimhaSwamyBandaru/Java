public class NestedFor {
    public static void main(String[] args) {
        for (int i=1;i<5;i++) {
            System.out.println("You got promoted");
            if (i == 4) {
                break;

            }
            for (int j = 0; j <= 2; j++) {
                System.out.println("You got hike on your salary");
            }
        }
    }
}
