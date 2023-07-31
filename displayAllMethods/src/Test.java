import java.util.Scanner;

public class Test {

void divisible2(int n) {
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            System.out.println("Divisible by 2 is " + i);
        }
    }
}
    void divisible3(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Divisible by 3 is " + i);
            }
        }
    }
        void divisible5(int n){
            for (int i = 1; i <= n; i++) {
                if (i % 5 == 0) {
                    System.out.println("Divisible by 5 is " + i);
                }
            }
        }
            void divisible2and5(int n){
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0 && i % 5 == 0) {
                        System.out.println("Divisible by 2 and 5 is " + i);
                    }
                }
            }
                void odd(int n){
                    for (int i = 1; i <= n; i = i + 2) {
                        if (i % 5 == 0) {
                            System.out.println("odd numbers by divisible 5 is " + i);
                        }
                    }
                }
                    void prime(int n){
                        for (int i = 2; i < n; i++) {
                            if (n % i == 0) {
                                System.out.println("Enter number " + n + " is not prime number");
                                return;
                            }
                        }
                        System.out.println("Enter number " + n + " is prime number");
                    }
    void oddwith5(int n){
        for (int i = 1; i <= n; i = i + 2) {
            if (i % 5 == 0) {
                System.out.println("odd numbers by divisible 5 is " + i);
            }
        }
    }
    void divisible5wth3(int n){
        for (int i = 0; i <= n; i = i + 5) {
            if (i % 3 == 0) {
                System.out.println("all numbers divisible by 3 and comes in table of 5 " + i);
            }
        }
    }
    void  numbersdivisiblebyeven3(int n){
        for (int i = 0; i <= n; i = i + 2) {
            if (i % 3 == 0) {
                System.out.println("all even numbers divisible by 3 " + i);
            }
        }
    }
    void allEven(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number is " + i);
            }
        }
    }

                    

}

