package com.ui.tests;

import static com.constants.Browser.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest2 {
	HomePage homepage;
	@BeforeMethod(description = "Load the homepage of the website")
	public void setUp() {
		 homepage = new HomePage(CHROME);

	}

	@Test(description = "Verifys valid user is able to login into the application",
			groups = {"e2e","sanity"},retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginTest() {
		Assert.assertEquals(homepage.goToLoginPage().doLoginWith("covala7651@noomlocs.com", "passwor").getTextMethod(),"Sowmya Priya");
	}

}
