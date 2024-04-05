package org.example.class2;

public class Variables {
    public static void main(String[] args) {
        String firstName="Maggy";
        String lastName="Ochir";
        String city="Oakland";
        String state="California";
        String phoneNumber="+4157709655";



        System.out.println("My first name is"+" "+ firstName+ " and my last name is"+" "+lastName);
        System.out.println("I live in"+" "+city+" "+state);
        System.out.println("My phone number"+" "+phoneNumber);

        city="Houston";
        state="Texas";
        phoneNumber="+4157709666";
        System.out.println("My first name is"+" "+ firstName+ " and my last name is"+" "+lastName);
        System.out.println("I moved to"+" "+city+" "+state);
        System.out.println("My new phone number"+" "+phoneNumber);

    }
}
