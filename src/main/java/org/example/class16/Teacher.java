package org.example.class16;
/*Write a Teacher class   that have instance variables name and address. Create
a constructor  that will initialize those variables. Print name & address of given
Teacher using displayInfo method.*/
public class Teacher {
    String name;
    String address;

    Teacher(String eName, String eAddress) {
        name = eName;
        address = eAddress;}
    void displayInfo(){
        System.out.println(name+" "+address);
    }

public static void main(String[] args) {
    Teacher t=new Teacher("Maggy","398 Euclid ave unit 302");
    t.displayInfo();
}}
