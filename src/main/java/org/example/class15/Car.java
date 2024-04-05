package org.example.class15;

public class Car {
    String make;
    int BuiltIn;
    double mileage;
    Car(String m, int B, double M){
        make=m;
        BuiltIn=B;
        if(mileage<100.5){
             mileage=M;}
        else{
            System.out.println("old car");
        }}
        void printInfo(){
            System.out.println(make+" "+BuiltIn+" "+mileage);
        }
}