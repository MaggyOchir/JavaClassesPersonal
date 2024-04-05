package org.example.class15;

import javax.imageio.stream.ImageInputStream;

public class Task2 {
    /*2. Create a method that will take a String as a parameter and returns a reversed String.
    Method should be available to all classes within your project and accessible by class name.. */
       /* public static String reverseName(String str) {
        StringBuilder reverse=new StringBuilder(str);
        for (int i = str.length() - 1; i>=0; i--);
           } */
//public static String reverseStr(String str){
  //  return new StringBuilder().reverse().toString();
    public static String reverseStr(String str) {
        String reverseStr = "Maggy";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr +=str.charAt(i);
        }
        return reverseStr;
    }

    public static void main(String[] args) {
    System.out.println(Task2.reverseStr("Maggy"));

        }
    }