package pageObjects.Pages.MainPage;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class InternetArchiveFloater extends BaseClass {

	// Elements

	private static List<WebElement> iconLinks() {
		return driver.findElements(By.cssSelector("center.mt-big"));
	}

	private static WebElement searchBarIAF() {
		return driver.findElement(By.name("search"));
	}

	private static WebElement goButton() {
		return driver.findElement(By.cssSelector("button.btn.input-sm"));
	}

	private static WebElement advancedSearchButton() {
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}

	private static WebElement seeMoreButton() {
		return driver.findElement(By.cssSelector("div.pull-right a"));
	}

	// Methods for interactions

	public void clickIconLinks(Integer index) {
		iconLinks().get(index).click();
	}

	public void clickSearchBarIAF() {
		searchBarIAF().click();
	}
	
	public void searchBarIAFInput(String searchTerm) {
		searchBarIAF().sendKeys(searchTerm);
	}
	
	public void clickGoButton() {
		goButton().click();
	}

	public void clickAdvancedSearchButton() {
		advancedSearchButton().click();
	}

	public void clickSeeMoreButton() {
		seeMoreButton().click();
	}
}
