package com.java;

public class UsingIndexOfAndSubstring {
    public static void main(String[] args) {
        String ipaddress="122.72.1.45";
        System.out.println("IP address:" +ipaddress);

        int index1=ipaddress.indexOf('.');
        System.out.println("The second index of'.':" +index1);

        int index2=ipaddress.indexOf('.',index1+1);
        System.out.println("The Second index of'.':" +index2);

        String SecondByte=ipaddress.substring(index2,index2);
        System.out.println("Second byte of the ip Address is:" +SecondByte);

    }
}
