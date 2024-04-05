package org.example.class15;

import java.awt.*;

public class Cat {
    String name;
    String color;
    int age;

    Cat(String cName, String cColor, int cAge){
    name=cName;
    color=cColor;
        if(age<30){
            age=cAge;}
        else{
        System.out.println("Wrong value");
    }}
   void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
