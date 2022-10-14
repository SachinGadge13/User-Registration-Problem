package com.bridgelabz.JUnitTesting;

import com.bridgelabz.JUnitTesting.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for validating first name
 */

public class UserRegistrationTest {
	    UserRegistration userRegistration;
	    @Before
	    public void before() {
	        userRegistration = new UserRegistration();
	    }

	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Utkarsh");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
	        boolean result = userRegistration.firstName("utkarsh");
	        Assert.assertEquals(false, result);
	    }

}