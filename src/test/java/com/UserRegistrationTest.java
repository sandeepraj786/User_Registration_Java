package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)

public class UserRegistrationTest {
    private String eMail;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public UserRegistrationTest(String eMail,boolean expectedResult) {
        this.eMail = eMail;
        this.expectedResult = expectedResult;
    }


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
    @Parameterized.Parameters
    public static Collection eMailIds_WithExpectedResult() {
        return Arrays.asList(new Object[][] {   {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false} });
    }

    @Test
    public void givenEmailIds_WhenProper_ShouldReturnExpectedResult() {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println("Expected Result:"+ expectedResult);
        Assert.assertEquals(expectedResult, userRegistration.validEmailId(eMail));
    }
}
