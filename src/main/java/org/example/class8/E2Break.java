package org.example.class8;

public class E2Break {
    public static void main(String[] args) {
          int[] i={10,20,30,40,50};
          for(int num:i){
              if(num>30){
                  continue;}
              System.out.println(num+10);
              System.out.println(num*10);
              System.out.println(num/10);
              System.out.println(num%10);
              System.out.println(num+20);
          }
        }
        }