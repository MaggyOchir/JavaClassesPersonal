package org.example.class13;

public class Task1 {
    String createEmail(String firstName, String lastName, String emailType) {
        String email = firstName + lastName + "@" + emailType + ".com";
        return email;
    }
}