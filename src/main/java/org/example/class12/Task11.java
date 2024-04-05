package org.example.class12;

public class Task11 {
    //sentence with number letter special char and count upper and lower cases in the sentence
    public static void main(String[] args) {
        String str = "hahah";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
