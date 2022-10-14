package com.bridgelabz.JUnitTesting;

import com.bridgelabz.JUnitTesting.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration;
	@Before
	public void before() {
		userRegistration = new UserRegistration();
	}
    /**
     * Unit test for validating first name
     */

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
	/**
	 * Unit test for validating last name
	 */
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Mishra");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("mishra");
		Assert.assertEquals(false, result);

	}

}