package org.example.class12;

public class Palindrome {
    void PD(String w) {
        StringBuilder word = new StringBuilder(w);
        word.reverse();
        String rev = word.toString();
        if (word.equals(rev)) {
            System.out.println("The word is Palindrome");
        } else {
            System.out.println("The word is not Palindrome");
        }
    }
}
