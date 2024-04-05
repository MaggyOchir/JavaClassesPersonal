package org.example.review5;

public class E2NestedLoop2dArray {
    public static void main(String[] args) {
        int [][]numbers={{10,20,30,40},
                        {50,70,15,88},
                        {45,52,89,77} };
//10,50,45,20,70,52
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(numbers[i][j]+" ");

            }

        System.out.println();
    }}}
