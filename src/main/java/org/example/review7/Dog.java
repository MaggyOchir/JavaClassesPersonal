package org.example.review7;

public class Dog {
    private String name;
    static String noOflegs;

    Dog(String name) {
        this.name=name;
    }

    void printName() {
        System.out.println(name);
        System.out.println(noOflegs); // static variable can be used in instance method.
    }
    static void staticPrintName(){
        //System.out.println(name); instance variable cannot be used in a static method.
        System.out.println(noOflegs);
            }
}
