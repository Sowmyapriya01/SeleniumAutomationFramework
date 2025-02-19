package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;

public class HomePage extends BrowserUtility{

	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");
	
	public HomePage(Browser browserName) {
		super(browserName);
		goToWebsite("http://www.automationpractice.pl/index.php");
		maximizeWindow();
	}
	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginpage = new LoginPage(getDriver());
		return loginpage;
	}
}
