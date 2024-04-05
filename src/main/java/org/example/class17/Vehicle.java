package org.example.class17;

public class Vehicle {
   String name;
    String color;}

class Car extends Vehicle{

}
class BMW extends Car{

    void printColor(){
        System.out.println(color);
    }
}