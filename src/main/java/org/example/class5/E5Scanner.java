package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your first gender m/f");
        char gender=scanner.next().charAt(3);
        System.out.println(gender);


    }

}
