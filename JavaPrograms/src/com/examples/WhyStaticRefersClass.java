package com.examples;

public class WhyStaticRefersClass {

    static int a;

    //Explicitly creating Constructor . If not created compiler creates constructor implicitly
     private WhyStaticRefersClass(){
        System.out.println("Constructor called when object created"); // constructor is called when object created
    }


    public static void main(String[] args) {
        WhyStaticRefersClass.a = 10;
        WhyStaticRefersClass.callingMethod();
        WhyStaticRefersClass whyStaticRefersClass = new WhyStaticRefersClass();
        whyStaticRefersClass.a= 9;

        WhyStaticRefersClass whyStaticRefersClass1 = new WhyStaticRefersClass();
        whyStaticRefersClass1.a= 125;
        System.out.println("a value called by object "+whyStaticRefersClass.a);
        System.out.println("a value called by object1 "+whyStaticRefersClass1.a);

    }

    public static void callingMethod(){
        WhyStaticRefersClass.a=5;
        System.out.println("a value inside calling method: "+a);


    }


}
