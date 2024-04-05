package org.example.class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your height?");
        int height=scan.nextInt();
        if(height<60)
        {System.out.println("You are short");}
        if(height>60&&height<72)
        {System.out.println("You are medium");}
        if(height>72)
        {System.out.println("You are tall");
    }}}