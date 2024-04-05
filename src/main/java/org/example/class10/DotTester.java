package org.example.class10;

public class DotTester {
    public static void main(String[] args) {
Dog dogobj1=new Dog();

dogobj1.name="Jimmy";
        dogobj1.breed="German";
        dogobj1.color="Black";
        dogobj1.age=4;
        dogobj1.weight=20;
        dogobj1.bark();

  Dog dog2=new Dog();

  dog2.name="Jacky";
  dog2.color="purple";
  dog2.breed="bulldog";
    dog2.age=12;
    dog2.weight=23;
        System.out.println(dog2.name);
        System.out.println(dog2.color);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);
        System.out.println(dog2.weight);


    }
}
