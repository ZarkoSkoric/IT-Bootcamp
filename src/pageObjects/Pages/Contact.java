package pageObjects.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Contact extends BaseClass {

	// Elements
	private static List<WebElement> mapsContact() {
		return driver.findElements(By.cssSelector("div.col-md-9 a img"));
	}
	
	// Methods for Interactions
	public void clickMapsContact(Integer index) {
		mapsContact().get(index).click();
	}
}
