package org.example.class16;

public class Constructor {
    private String color;
    private String make;
    private int year;
    private double mileage;

    Constructor(String eColor, String eMake, int eYear, double eMileage){
       color=eColor;
       make=eMake;
       year=eYear;
       mileage=eMileage;
    }

    public String getColor() {
        return color;
    }
}
