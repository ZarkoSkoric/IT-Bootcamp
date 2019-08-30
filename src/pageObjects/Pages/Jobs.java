package pageObjects.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Jobs extends BaseClass {

	// Elements

	private static WebElement jobSearchBar() {
		return driver.findElement(By.cssSelector("input#q"));
	}

	private static WebElement jobSearchButton() {
		return driver.findElement(By.cssSelector("input#q"));
	}

	private static WebElement jobAdvancedSearchButton() {
		return driver.findElement(By.id("link_show_advanced_search"));
	}

	private static List<WebElement> jobGeneratedListElements() {
		return driver.findElements(By.cssSelector("table#jobs_table tr"));
	}

	// Methods for Interactions

	public void jobSearchBarInput(String searchTerm) {
		jobSearchBar().sendKeys(searchTerm);
	}

	public void clickJobSearchButton() {
		jobSearchButton().click();
	}

	public void clickJobAdvancedSearchButton() {
		jobAdvancedSearchButton().click();
	}

	public void getJobGeneratedListElements(Integer index) { // >0 ??
		jobGeneratedListElements().get(index).getText();
	}

	public void getJobGeneratedListSize() { // >0 ?? iframe switchto()
		jobGeneratedListElements().size();
	}

}
