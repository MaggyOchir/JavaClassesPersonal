package org.example.class11;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String babe="boy";
        System.out.println("Please enter mom's first name");
        String mom= scanner.nextLine();
        System.out.println("Please enter dad's first name");
        String dad= scanner.nextLine();

        if(babe.equals(babe)){

            System.out.println(mom.toUpperCase().substring(0,2)+dad.toUpperCase().substring(3,6));}
                else{System.out.println(dad.toUpperCase().substring(0,3)+mom.toUpperCase().substring(2,4));}
            }

        }


