package org.example.class17;

public class ClassX {
        String brand;
        String diamond;
    }
    class ClassY extends ClassX {
    }

    class ClassZ extends ClassY {

        void printInfo() {
            System.out.println(brand);
        }

        void treasure() {
            System.out.println(diamond + " and " + brand);
        }

    public static void main(String[] args) {
        ClassZ z = new ClassZ();
        z.brand = "LV";
        z.diamond = "Brilliant";

        z.treasure();
    }}

