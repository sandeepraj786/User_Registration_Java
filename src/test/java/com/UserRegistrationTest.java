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

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validMobileNumber("91 8149600728");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validMobileNumber("918149600728");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validMobileNumber("91 8149600");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("oTp1f2*gf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtLeastOneUpperCase_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("Sandee@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTru() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("a1jsgdjT*");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("#Sandeep123");
        Assert.assertTrue(result);
    }

    @Test
    public void  givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("Raj12%");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("Sandeep123");
        Assert.assertFalse(result);

    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("Sandeep@raj");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validPassword("%*SandeepRaj");
        Assert.assertFalse(result);

    }
}
