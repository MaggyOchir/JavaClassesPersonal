package org.example.class12;

public class E2StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Sunday12345%$");
        str.deleteCharAt(12); //only delete one char
        System.out.println(str);
        str.delete(6,13); //delete all char in between called indexes
        System.out.println(str);


    }
}
