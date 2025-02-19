package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility {
	private static final By EMAIL_LOCATOR = By.id("email");
	private static final By PWD_LOCATOR = By.id("passwd");
	private static final By SUBMIT_BUTTON_LOCATOR = By.id("SubmitLogin");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public MyAccountPage doLoginWith(String email,String pwd) {
		enterText(EMAIL_LOCATOR,email);
		enterText(PWD_LOCATOR, pwd);
		clickOn(SUBMIT_BUTTON_LOCATOR);
		MyAccountPage myAccountPage = new MyAccountPage( getDriver());
		return myAccountPage;
	}

}
