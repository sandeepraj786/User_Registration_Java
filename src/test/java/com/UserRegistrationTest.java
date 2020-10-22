package com;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserRegistration userRegistration =new  UserRegistration();
        boolean result=userRegistration.validFirstName("Sandeep");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validFirstName("Sa");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validFirstName("San@dee");
        Assert.assertFalse(result);

    }

    @Test
    public void givenLastName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validLastName("Raj");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validLastName("Ra");
        Assert.assertFalse(result);
    }
}
