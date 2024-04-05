package org.example.class4;

public class Task5 {
    public static void main(String[] args) {
        double mortgageRate=4.4;
        long housePrice=90000l;

        if(mortgageRate>4.5) {
            System.out.println("User will not buy a house");
        }else{ if (mortgageRate<4.5) {
            System.out.println("User will consider buying a house");
        }if(housePrice>100000){
            System.out.println("User will take a loan");
        }if(housePrice<100000){
            System.out.println("User will buy in cash");
        }}
    }
}
