package com.examples;

public class WhyInstanceRefersToObject {

    int i;

    public static void main(String[] args) {
        WhyInstanceRefersToObject whyInstanceRefersToObject1 = new WhyInstanceRefersToObject();
        whyInstanceRefersToObject1.i =10;

        System.out.println("object1 "+whyInstanceRefersToObject1.i);

        WhyInstanceRefersToObject whyInstanceRefersToObject2  = new WhyInstanceRefersToObject();
        whyInstanceRefersToObject2.i =100;

        System.out.println("object2 "+whyInstanceRefersToObject2.i);


        System.out.println("object1 "+whyInstanceRefersToObject1.i);

    }
}
