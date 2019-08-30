package pageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class LogIn extends BaseClass {

	// Elements
	private static WebElement loginSignUpFreeLink() {
		return driver.findElement(By.name("username"));
	}
	
	private static WebElement loginEmailBox() {
		return driver.findElement(By.name("username"));
	}

	private static WebElement loginPasswordBox() {
		return driver.findElement(By.name("password"));
	}

	private static WebElement loginSeeOrHidePassButton() {
		return driver.findElement(By.cssSelector("img.password_icon"));
	}

	private static WebElement loginForgotPassword() {
		return driver.findElement(By.cssSelector("div.password-message a"));
	}

	private static WebElement loginRememberMeButton() {
		return driver.findElement(By.name("remember"));
	}

	private static WebElement loginSubmitButton() {
		return driver.findElement(By.name("submit-to-login"));
	}
	
	private static WebElement loginErrorMessage() {
		return driver.findElement(By.name("span.password-error"));
	}
	
	// Methods for Interactions

	public void clickLoginSignUpFreeLink() {
		loginSignUpFreeLink().click();
	}
	
	public void loginSubmittButtonIsDisplayed() {
		loginSubmitButton().isDisplayed();
	}
	
	public void loginEmailInput(String email) {
		loginEmailBox().sendKeys(email);
	}

	public void loginPasswordInput(String password) {
		loginPasswordBox().sendKeys(password);
	}

	public void clickLoginSeeOrHidePassButton() {
		loginSeeOrHidePassButton().click();
	}

	public void clickLoginForgotPasswordLink() {
		loginForgotPassword().click();
	}
	
	public boolean loginForgotPasswordIsDisplayed() {
		return loginForgotPassword().isDisplayed();
	}

	public void clickLoginRememberMeButton() {
		loginRememberMeButton().click();
	}

	public void clickLoginSubmitButton() {
		loginSubmitButton().click();
	}
	
	public boolean loginErrorMessageIsDisplayed() {
		return loginErrorMessage().isDisplayed();
	}
}
