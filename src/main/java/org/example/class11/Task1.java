package org.example.class11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userName= scanner.next();
        String password= scanner.next();
        String confirm=scanner.next();
if(userName.isEmpty()||password.isEmpty()){
    System.out.println("User name or Password can not be empty");}
else if(userName.length()>8){
    System.out.println("Password is too short");}
else if(password.contains(userName)){
    System.out.println("Password can not contain user name");}
else if(!confirm.equals(password)){
    System.out.println("Password do not match");}
else{
    System.out.println("your user name and password is created");
           }
       }

    }
