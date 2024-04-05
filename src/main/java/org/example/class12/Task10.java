package org.example.class12;

public class Task10 {
    //sentence with number letter special char and count upper and lower cases in the sentence
    public static void main(String[] args) {
        String str="My Password is Maggy";
        String[] strArray= str.split(" ");
        for(String s:strArray){
            StringBuilder st=new StringBuilder(s);
            st.reverse();
            System.out.print(st+" ");
        }

        
            }
        }