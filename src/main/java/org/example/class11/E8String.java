package org.example.class11;

public class E8String {
    public static void main(String[] args) {
        //how many times the t is in this string.
        String st = "Matt is going to regret soon";
        int count = 0;
      for (int i = 0; i < st.length(); i++){
          if(st.charAt(i)=='t'||st.charAt(i)=='T'){
              count++;
          }}
          System.out.println(count);
      }
            }


