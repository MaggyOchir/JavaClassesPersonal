package org.example.class11;

public class E14StringSplitSentences {
    public static void main(String[] args) {
        String st = "Matt you still have time Run away. Listen to me only. Everyone else is lying.";
        String[]sentences=st.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[1].trim());

        }
    }




