package kodnest;

public class Demo {
    public void findPalin(int n){
        int temp=n;
        int rem=0;
        int rev=0;
        while (n>0){
            rem=n%10;
           rev=rev*10+rem;
            n=n/10;

        }
        if (temp==rev){
            System.out.println("It is a palindrome"+rev);

        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}
