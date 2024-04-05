package org.example.class15;

public class Task3 {
    /*2Create a method that will take a String as a parameter and returns a new String that consist
    only of vowels. Method should be available inside the class only where it was declared and
    executed by calling its name only */
    private static String getVowels(String n){
       // String n="Maggy";
        //for(int i=0; i<n.length(); i++){
          //  name=n.indexOf(1,4)
            //System.out.println(name);
    return n.replaceAll("[^ay]","");
    }

    public static void main(String[] args) {
        System.out.println(getVowels("Maggy"));
    }}
//to call the vowels from the word and use new string, we can use many different methods
// including replaceAll ^, switch, if statement with "and" ||, so on.
