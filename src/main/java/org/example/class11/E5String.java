package org.example.class11;

public class E5String {
    public static void main(String[] args) {
       String st="Matt likes a Watermelon. He is again in the kitchen";
        System.out.println(st.contains("likes")); //ene ug bgaa esehiig ugyylbert haina. bval true utga
        System.out.println(st.contains("pretty")); // herev bhgui bol false itga
        System.out.println(st.toLowerCase().contains("Matt")); //bugdiig n jijig usegt huvirgasnii daraa haina.
        System.out.println(st.startsWith("M"));//ene usgeer ehelsen ug bgaa eheshiig haina. print true or false
        System.out.println(st.endsWith("kitchen"));
        System.out.println(st.endsWith("again"));
}}
