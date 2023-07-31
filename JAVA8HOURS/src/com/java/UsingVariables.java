package com.java;

public class UsingVariables {
    public static void main(String[] args) {
        String name="steve";
        int quantity=2;
        double price1=9.99;
        float price2=9.99f;
        boolean outofstock=false;

        String anotherName=name;
        double amount1=price1*quantity;
        double amoumt2=price2*quantity;
        System.out.println(name);
        System.out.println(quantity);
        System.out.println(price1);
        System.out.println(price2);
        System.out.println(amount1);
        System.out.println(amoumt2);
    }
}
