package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		By signInLocator = By.xpath("//a[contains(text(),'Sign in')]");
		WebElement signInWebElement = driver.findElement(signInLocator);
		signInWebElement.click();
		By emailLocator = By.id("email");
		WebElement emailWebElement = driver.findElement(emailLocator);
		emailWebElement.sendKeys("covala7651@noomlocs.com");
		By pwdLocator = By.id("passwd");
		WebElement pwdWebElement = driver.findElement(pwdLocator);
		pwdWebElement.sendKeys("password");
		By submitButtonLocator = By.id("SubmitLogin");
		WebElement submitButtonWebElement = driver.findElement(submitButtonLocator);
		submitButtonWebElement.click();
	}

}
