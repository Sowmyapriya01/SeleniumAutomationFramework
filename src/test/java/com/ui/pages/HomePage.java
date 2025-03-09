package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.constants.Env;

import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertyUtil.*;
import com.utility.JSONUtility;


public class HomePage extends BrowserUtility{

	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");
	
	public HomePage(Browser browserName) {
		super(browserName);
//		goToWebsite(readProperty(QA,"URL"));
		goToWebsite(JSONUtility.readJSON(Env.QA).getUrl());
		maximizeWindow();
	}
	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_LOCATOR);
		LoginPage loginpage = new LoginPage(getDriver());
		return loginpage;
	}
}
