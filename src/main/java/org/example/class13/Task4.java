package org.example.class13;

public class Task4 {
        //Create a method which is going to take an array as input and its going to return
        // the count of numbers which are greater than 10 in that array.

        int addArray(int [] arr){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>10){
                count++;

            }
        }return count;
        }
    }

