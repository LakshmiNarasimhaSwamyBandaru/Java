package com.package1;

public class AllSpecifiers {
    public int a;
    private int b;
    protected int c;
    int d;


    static public int e;
    static private int f;
    static protected int g;
    static int h;

    public void methodA(){}
    private void methodB(){}
    protected void methodC(){}
    void methodD(){}

    static public void methodE(){}
    static private void methodF(){}
    static protected void methodG(){}
    static void methodH(){}



    public static void main(String[] args) {

        //Private variables can be access only inside same class
        AllSpecifiers allSpecifiers = new AllSpecifiers();
        allSpecifiers.b= 30;
        allSpecifiers.methodB();

        f=10;
        AllSpecifiers.f = 100;
        AllSpecifiers.methodF();

    }
}
