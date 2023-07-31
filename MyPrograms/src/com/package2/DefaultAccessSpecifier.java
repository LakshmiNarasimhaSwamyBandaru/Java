package com.package2;

import com.package1.AllSpecifiers;

public class DefaultAccessSpecifier {

    public static void main(String[] args) {
        AllSpecifiers allSpecifiers = new AllSpecifiers();
//        allSpecifiers.d  // Default variables or methods are not accessible outside package

    }
}
