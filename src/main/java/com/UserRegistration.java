package com;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";;

    public boolean validFirstName(String fName) {
        
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            return pattern.matcher(fName).matches();
        }
    }

