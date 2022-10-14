package com.bridgelabz.JUnitTesting;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    /*
       Unit test for validating first name starts with Capital Letter
       Used try catch block to handle the exception
    */
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.firstName("Mallepogu");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = userRegistration.firstName("mallepogu");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.firstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating last name starts with Capital Letter
       Used try catch block to handle the exception
    */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.lastName("Alankritha");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.lastName("alankritha");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenLAstName_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.lastName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.lastName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating email address
       Used try catch block to handle the exception
    */
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.email("abc@yahoo.com");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.email("abc()*@gmail.com");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.email(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
        try {
            boolean result = userRegistration.email("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating phone number in a pre-defined format
       Used try catch block to handle the exception
    */
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.phoneNumber("91 4736599888");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        try {
            boolean result = userRegistration.phoneNumber("+91 7464999888");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.phoneNumber(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.phoneNumber("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password with minimum 8 characters
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule1("password@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule1("psw@");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule1(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule1("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password should contain atleast one upper case
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule2("passWord@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule2("psw@");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule2(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule2("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password should contain atleast one numeric value
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule3("123Aa@123");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule3("123456789");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule3(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule3("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
       Unit test for validating password should contain atleast one special character
       Used try catch block to handle the exception
    */
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        try {
            boolean result = userRegistration.passwordRule4("@123@Abc");
            Assert.assertEquals(true, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        try {
            boolean result = userRegistration.passwordRule4("@@@@@@@@@A");
            Assert.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule4(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.NULL, e.type);
            System.out.println(e);
        }
    }

    @Test
    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
        try {
            userRegistration.passwordRule4("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.type.EMPTY, e.type);
            System.out.println(e);
        }
    }

    /*
     Unit test for validating mood of user happy or sad
     Used try catch block to handle the exception
   */
    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() throws MoodAnalyserException {
        try {
            String result = MoodAnalyser.analyseMood("User is Happy");
            Assert.assertEquals("Entry Successful", result);
        } catch (MoodAnalyserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_WhenNotProper_ShouldReturnEntryFailed() throws MoodAnalyserException {
        try {
            String result = MoodAnalyser.analyseMood("User is Sad");
            Assert.assertEquals("Entry Failed", result);
        } catch (MoodAnalyserException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMessage_NULL_ShouldReturnMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.type.NULL, e.type);
        }
    }

    @Test
    public void givenMessage_EMPTY_ShouldReturnMoodAnalyserException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            MoodAnalyser.analyseMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.type.EMPTY, e.type);
        }
    }
}