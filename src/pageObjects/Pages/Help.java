package pageObjects.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Help extends BaseClass {

	// Elements
	
	private static WebElement helpSearchBox() {
		return driver.findElement(By.cssSelector("input#query"));
	}
	private static List<WebElement> helpLinkButtons() {
		return driver.findElements(By.cssSelector("a.blocks-item-link"));
	}
	private static WebElement helpSignInButton() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	// Methods for Interactions
	
	public void helpSearchBoxInput(String searchTerm) {
		helpSearchBox().sendKeys(searchTerm);
	}
	public void helpSearchBoxEnter() {
		helpSearchBox().sendKeys(Keys.ENTER);
	}
	public void clickHelpButtons(Integer index) {
		helpLinkButtons().get(index).click();
	}
	public void getHelpSignInButton() {
		helpSignInButton().click();
	}
	
}
