package com.package2;

import com.package1.AllSpecifiers;

public class ProtectedAccessSpecifierMakingAccessibleOutsidePackage extends AllSpecifiers {

    public static void main(String[] args) {
        ProtectedAccessSpecifierMakingAccessibleOutsidePackage specifiers = new ProtectedAccessSpecifierMakingAccessibleOutsidePackage();
        specifiers.c=50;
        specifiers.methodC();
    }
}
