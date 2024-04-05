package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age =scanner.next().charAt(3);
        System.out.println(age);

        System.out.println("Please enter your Full name");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("Your name is "+(name)+" you are" +(age)+ "years old");


    }

}
