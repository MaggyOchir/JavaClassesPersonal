package org.example.class15;

public class Task1Tester {
    /*1. Create a method that will accept an array as parameters and will return a sum of all
    elements from that array. Method should be visibly only within same package and accessible
    by the creating an instance/object of the class.
    2. Create a method that will take a String as a parameter and returns a reversed String.
    Method should be available to all classes within your project and accessible by class name.
    3. Create a method that will take a String as a parameter and returns a new String that consist
    only of vowels. Method should be available inside the class only where it was declared and
    executed by calling its name only
     */
     public static void main(String[] args) {

        Task1 sum=new Task1();
        int []array = {10,20,30};
        int sum1=sum.sumArray(array);
        System.out.println(sum1);
    }}
