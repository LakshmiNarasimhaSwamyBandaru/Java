package com.package2;

import com.package1.AllSpecifiers;

public class PublicAccessSpecifier {
    public static void main(String[] args) {
        AllSpecifiers allSpecifiers = new AllSpecifiers();
        allSpecifiers.a= 20;
        allSpecifiers.methodA();

    }
}
