package org.example.class12;

public class E3StringBuilderInsert {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Sunday12345%$Monday");
        str.insert(2,"a");
        System.out.println(str);


    }
}
