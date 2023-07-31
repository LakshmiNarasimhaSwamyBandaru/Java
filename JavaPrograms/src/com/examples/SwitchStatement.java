package com.examples;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int number=object.nextInt();
        switch(number){
            case 10:
                System.out.println("The switch case output number is "+number);
                break;
            case 15:
                System.out.println("The switch case output number is "+number);
                break;
            default:
                System.out.println("The default number is "+number);

        }
    }
}
