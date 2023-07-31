package com.java;

public class ConcatenationVariables {
    public static void main(String[] args) {
        String message;
        String name="Subbu :";
        String unit="km";
        int Hours=1;
        int minutes=20;
        int seconds=2;
        double distance=21.1;

        message=name+"ran"+distance+unit+"in"+Hours+"hours,"+minutes+"minutes."+seconds+"seconds.";
        System.out.println(message);
    }
}
