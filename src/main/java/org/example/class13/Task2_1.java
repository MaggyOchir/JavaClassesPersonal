package org.example.class13;

public class Task2_1 {
    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 4; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

    return true;
}}
/*boolean isPrime(int n){
        if(n<=1){
            return false;
        }else if(n==2||n==3){
            return true;
        }
        for (int i = 4; i <n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;

    }*/