package org.example.class17;

public class Bird {
    private String name;
    private String color;
    private int age;

    Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + color);
    }
}

class Parrot extends Bird {
    Parrot(String name, String color, int age) {
        super(name, color, age);
    }

}
class BirdTester {
    public static void main(String[] args) {

        Parrot p = new Parrot("Lucky","Green",17);
        p.printInfo();
    }
}
