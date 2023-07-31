public class NestedIfElse2 {

        public static void main(String[] args)
        {
            int a=100;
            int b=200;
            if(a>b)
            {
                System.out.println("A is greater");
            }
            else
            {
                System.out.println("A IS less than B");
                if(a<b || a>b)
                {
                    System.out.println("A is less than B");
                }
                else
                {
                    System.out.println("B is greater");
                }

            }
        }
    }


