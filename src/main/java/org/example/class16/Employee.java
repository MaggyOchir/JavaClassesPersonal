package org.example.class16;
public class Employee {
    private String name;
    private String id;
    private int age;
    private double salary;

    public Employee(String eName, String eId, int eAge, double eSalary){
        name=eName;
        id=eId;
        if(eAge<150){
        age=eAge;}else{
            System.out.println("not allowed");
        }
        salary=eSalary;
    }

void printName(){
        System.out.println(name);
}
void printAge(){
    System.out.println(age);
}}


//variable of constructor or void should be same name as class.