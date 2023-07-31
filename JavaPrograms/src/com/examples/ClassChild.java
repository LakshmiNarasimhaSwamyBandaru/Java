package com.examples;

public class ClassChild extends ClassParent{

    @Override
    public void display() {

        System.out.println("I am child");

    }
    public ClassChild(){
        this("Calling from No Arg constructor");

    }

    public ClassChild(String arg){
        super("Hi");
        System.out.println(arg);
        System.out.println(this.hashCode());


    }

    public static void main(String[] args) {
        ClassParent classChild = new ClassChild();
        ClassParent classChild1 = new ClassChild();
//        classChild.display();


    }
}
