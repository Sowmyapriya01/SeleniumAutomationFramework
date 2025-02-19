package com.ui.tests;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;

public class LoginTest1 {

	public static void main(String[] args) {
		HomePage homepage = new HomePage(EDGE);
		String userName = homepage.goToLoginPage().doLoginWith("covala7651@noomlocs.com", "password").getTextMethod();
		System.out.println(userName);
	}

}
