package pageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class SignUpPage extends BaseClass {

	
	// Elements
	
	private static WebElement signUpTermsButton() {
		return driver.findElement(By.linkText("Terms of Service")); // edit?
	}
	
	// Methods For Actions
	
	public void clickSignUpTermButton() {
		signUpTermsButton().click();
	}
}
