package org.example.review4;

public class Array2m {
    public static void main(String[] args) {
        int[]num={10,25,45,66,85,100};
        double sum=0;
        int counter=0;
        for (int n:num){
            if(n>25){
                sum+=n;
                counter++;
            }
        }
        System.out.println(sum/counter);

    }
}
