package org.example.class6;

import java.util.Scanner;

public class E13ForLoopCombinedScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting number of loop");
        int start= scanner.nextInt();
        System.out.println("Please enter the ending number of loop");
        int end=scanner.nextInt();
        System.out.println("Please enter the stepSize");
        int stepSize=scanner.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start=start+stepSize++;
        }
    }}
