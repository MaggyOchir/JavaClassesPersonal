package org.example.class5;

import java.util.Scanner;

public class Task12 {

    /*Ask user to enter their country and capture it.
    Once values are captured print which language user speaks.
    Just do this for any 5 countries*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("What country are you from?");
        String country= scanner.nextLine();
        switch(country){
            case "USA":
                System.out.println("We speak English");
            break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case "Mongolia":
                System.out.println("We speak Mongolian");
                break;
            case "Egypt":
                System.out.println("We speak Egyption");
                break;
            case "Korea":
                System.out.println("We speak Korean");
                break;
            default:
                System.out.println("country is not supported");

        }

    }


}
