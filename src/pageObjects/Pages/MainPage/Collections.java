package pageObjects.Pages.MainPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Collections extends BaseClass {

	// Elements

	private static WebElement collectionsResults() {
		return driver.findElement(By.className("results_count"));
	}
	
	private static List<WebElement> collectionsSortBy() {
		return driver.findElements(By.cssSelector("span.blue-pop a"));
	}

	private static List<WebElement> collectionGeneratedResultBlockList() {
		return driver.findElements(By.cssSelector("div.hov"));
	}

	private static List<WebElement> collectionRadioButtonsList() {
		return driver.findElements(By.name("sin")); // what to do with 4 hidden buttons?
	}

	private static List<WebElement> collectionMoreLinksList() {
		return driver.findElements(By.cssSelector("div.facets_collapser div.collapse"));
	}

	private static WebElement collectionSearchBar() {
		return driver.findElement(By.name("and[]"));
	}

	private static List<WebElement> collectionsPlayOptionsList() {
		return driver.findElements(By.cssSelector("div.welcome-right a")); // hidden? isDisplayed?
	}

	// Methods for Interactions
	
	public String getCollectionsResultsText() {
		return collectionsResults().getText();
	}

	public void clickCollectionsSortBySelect() {

	}

	public void clickCollectionResultBlockList() {

	}
}
