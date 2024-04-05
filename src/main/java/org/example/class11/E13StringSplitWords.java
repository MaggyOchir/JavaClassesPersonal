package org.example.class11;

public class E13StringSplitWords {
    public static void main(String[] args) {
        String st = "Matt you still have time Run away";
        String[]words=st.split(" ");
        System.out.println(words[0]);
        System.out.println(words.length);
        System.out.println(words[3]);
        for(int i=0; i< words.length;i++){
            System.out.print(words[i]+" ");
        }
    }
}



