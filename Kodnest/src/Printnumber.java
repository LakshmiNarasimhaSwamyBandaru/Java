import java.util.Scanner;

public class Printnumber {
    public static void main(String[] args) {
     /*   int enerylevel=8;
        while (enerylevel>=1){
            System.out.println("kodMan is fighting and energylevel"+enerylevel);
            enerylevel--;
        }*/
       /* while(true){
            System.out.println("Student reading the book");
        }*/
        Scanner scan=new Scanner(System.in);
        int pageno=100;
        boolean bored=true;
        int i=1;
        do{
            System.out.println("KodMan read the book"+i);
            i++;
            System.out.println("Do you want to continue");
            bored=scan.nextBoolean();
        }
        while (bored);
    }
}
