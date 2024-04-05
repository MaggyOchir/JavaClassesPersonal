package org.example.class10;

public class BankUser {
public static void main(String[] args) {
    Bank user=new Bank();

    user.client="Individual";
    user.fullName="Maggy";
    user.SSN=1234645;
    user.age=60;
    user.mainAccount=456789;
    user.creditScore=850;
    user.bankingYears=29;
    user.depositBalance=100000000;
    user.CDBalance=9000;
    user.mortgageBalance=0;

    System.out.println("as of Mar 21, 2024, "+user.fullName+ "'s balance in her deposit account with Chase bank is "+user.depositBalance+".");

}}




