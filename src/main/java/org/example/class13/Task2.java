package org.example.class13;

public class Task2 {
    public static void main(String[] args) {
        //Write a method to return whether given number is prime or not.
        int num = 11;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");

        }
    }
}
