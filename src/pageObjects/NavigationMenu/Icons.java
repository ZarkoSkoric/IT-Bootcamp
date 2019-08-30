package pageObjects.NavigationMenu;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Icons extends BaseClass {
	
	// Elements
	
	private static List<WebElement> iconsNav() {
		return driver.findElements(By.cssSelector("dropdown.dropdown-ia.pull-left"));
	}
	
	private static WebElement logoNav() {
		return driver.findElement(By.className("iconochive-logo")); // correctthis
	}
	
	private static WebElement signIn() {
		return driver.findElement(By.className("hidden-xs-span"));
	}
	
	private static WebElement upload() {
		return driver.findElement(By.className("iconochive-upload"));
	}
	private static WebElement navSearchBar() {
		return driver.findElement(By.id("search-bar-2"));
	}
	
	// Methods for interactions
	public void clickOnIcon(Integer index) {
		iconsNav().get(index).click();
	}
	public void clickOnLogoNav() {
		logoNav().click();
	}
	public void clickOnSignIn() {
		signIn().click();
	}
	public void clickOnUpload() {
		upload().click();
	}
	public void searchBarNavInput(String searchTerm) {
		navSearchBar().sendKeys(searchTerm);
	}
}
