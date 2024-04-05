package org.example.class5;

import java.util.Scanner;

public class E1Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("Please enter your age");

        int age= scan.nextInt();

        if (age>18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can wait");
        }
    }
}
