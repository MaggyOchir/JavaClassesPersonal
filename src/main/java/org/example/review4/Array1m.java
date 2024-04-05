package org.example.review4;

public class Array1m {
    public static void main(String[] args) {
        int[]num={10,25,45,66,85,100};
        int sum=0;
        for (int n:num){
        sum+=n;
        }
        System.out.println(sum/num.length);

    }
}
