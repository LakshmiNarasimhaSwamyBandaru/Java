package com.package1;

public class PublicAccessSpecifier {

    public static void main(String[] args) {
        AllSpecifiers allSpecifiers =  new AllSpecifiers();
        allSpecifiers.a =10;
        allSpecifiers.methodA();
        AllSpecifiers.methodE();


    }


}
