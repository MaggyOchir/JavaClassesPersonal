package org.example.class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name of your city?");
        String city=scanner.nextLine();
        System.out.println("what is the Temperature in your city?");
int F= scanner.nextInt();
int C=F-32*5/9;
        System.out.println("In "+city+" the temperature is "+ C+" in Celcius");
    }
}
