package org.example.class14;

public class DogTester {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Jacky";
        d1.color="black";
        d1.age=12;

        Dog d2=new Dog();
        d2.name="Lucky";
        d2.color="white";
        d2.age=3;
        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d1.noOflegs);
        System.out.println(d2.noOflegs);
    }

}