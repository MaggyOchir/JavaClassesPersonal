package org.example.class15;

public class Task1{
    /*Create a method that will accept an array as parameters and will return a sum of all
    elements from that array. Method should be visibly only within same package and accessible
    by the creating an instance/object of the class. */
 int sumArray(int [] arr){
     int sum=0;
     for(int i=0; i<arr.length; i++){
     sum+=arr[i];}
         return sum ;
     }
 }