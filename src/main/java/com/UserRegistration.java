package com;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String MOB_NUM_PATTERN = "^[0-9]{2}[ ]*[6-9][0-9]{9}$";


    public boolean validFirstName(String fName) {
        
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            return pattern.matcher(fName).matches();
        }

    public boolean validLastName(String lName) {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lName).matches();
    }

    public boolean validMobileNumber(String mobNum) {
        Pattern pattern=Pattern.compile(MOB_NUM_PATTERN);
        return pattern.matcher(mobNum).matches();
    }
}

