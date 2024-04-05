package org.example.class6;

import java.util.Scanner;

public class E12ForLoopCombinedScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting number of loop");
        int start= scanner.nextInt();
        System.out.println("Please enter the ending number of loop");
        int end=scanner.nextInt();
        while(start<end){
            System.out.print(start+" ");
            start++;
        }
    }}
