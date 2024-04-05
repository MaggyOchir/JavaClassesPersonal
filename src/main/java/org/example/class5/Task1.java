package org.example.class5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("What is the loan amount you are requesting?");

        int loan= scanner.nextInt();
        if (loan<=200000) {
            System.out.println("lend");
        }else{
            System.out.println("reject");}}}
