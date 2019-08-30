package pageObjects.NavigationMenu;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class PageLinks extends BaseClass {

	// Elements
	private static List<WebElement> navBarIcons() {
	return driver.findElements(By.id("ul#nav-abouts a"));
	}
	
	// Methods for interactions
	public void clickOnNavBarIcon(Integer index) {
		navBarIcons().get(index).click();
	}
}
