package com.kovanlabs.intern.java.regexpattern;

import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";

        String[] validEmails = {
                "test@example.com",
                "user.name@gmail.com",
                "username123@yahoo.in",
                "user_name@domain.org",
                "abc.def@company.co",
                "test-email@outlook.com",
                "name123@service.net",
                "info@website.io",
                "admin@server.edu",
                "contact@domain.com"
        };

        String[] invalidEmails = {
                "testexample.com",
                "user@.com",
                "@gmail.com",
                "user@gmail",
                "user@domain.",
                "user@domain.c",
                "user@domain..com",
                "user@@gmail.com",
                "user gmail.com",
                "user#gmail.com"
        };

        System.out.println("Valid Emails:");
        for (String email : validEmails) {
            System.out.println(email + " -> " + Pattern.matches(regex, email));
        }

        System.out.println("\nInvalid Emails:");
        for (String email : invalidEmails) {
            System.out.println(email + " -> " + Pattern.matches(regex, email));
        }
    }
}

