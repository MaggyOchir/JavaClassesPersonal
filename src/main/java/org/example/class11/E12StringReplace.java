package org.example.class11;

public class E12StringReplace {
    public static void main(String[] args) {
        String st = "Java is 23452637 good &*%$%)";
        System.out.println(st.replaceAll("[0-9]","*"));
        System.out.println(st.replaceAll("[a-z]",""));
        System.out.println(st.replaceAll("[A-Z]",""));
        System.out.println(st.replaceAll("[A-Za-z]",""));
        System.out.println(st.replaceAll("[A-Za-z0-9]",""));
        System.out.println(st.replaceAll("[^A-Za-z0-9]",""));//^ means do not remove

    }
}



