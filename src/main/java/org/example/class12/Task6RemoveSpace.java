package org.example.class12;

public class Task6RemoveSpace {
    public static void main(String[] args) {

        String sentence="Java is going to be easy for me.";
String newsentence=sentence.replaceAll(" ","");
        System.out.println(newsentence);
            System.out.println(sentence.replace(" ",""));

        }
    }