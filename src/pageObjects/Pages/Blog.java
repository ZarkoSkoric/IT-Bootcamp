package pageObjects.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.BaseClass;

public class Blog extends BaseClass {

	// Elements

	Select blogArchivesDropDown = new Select(driver.findElement(By.id("archives-dropdown-2")));

	private static List<WebElement> blogNavMenuElements() {
		return driver.findElements(By.cssSelector("ul#menu-menu li"));
	}

	private static List<WebElement> blogShareItem() {
		return driver.findElements(By.cssSelector("li#archive_sharing_widget-4 a.shareitem"));
	}	

	private static WebElement blogSearchBox() {
		return driver.findElement(By.cssSelector("input#s"));
	}

	private static WebElement blogSearchButton() {
		return driver.findElement(By.id("searchsubmit"));
	}

	private static List<WebElement> dynamicBlogSearchedElements() {
		return driver.findElements(By.cssSelector("div#content div.post"));
	}

	private static List<WebElement> dynamicBlogSearchedTitles() {
		return driver.findElements(By.cssSelector("div#content h2.entry-title"));
	}

	// Methods for Interactions
	
	public void clickBlogNavMenuElements(Integer index) {
		blogNavMenuElements().get(index).click();
	}

	public void getBlogNavMenuElementsText(Integer index) {
		blogNavMenuElements().get(index).getText();
	}

	public void clickBlogShareItem(Integer index) {
		blogShareItem().get(index).click();
	}
	public void clickBlogFacebookIcon() {
		clickBlogShareItem(0);
	}
	public void clickBlogTwitterIcon() {
		clickBlogShareItem(1);
	}
	public void blogSearchBoxInput(String searchTerm) {
		blogSearchBox().sendKeys(searchTerm);
	}
	public void clickBlogSearchButton() {
		blogSearchButton().click();
	}
	public void blogDropdownSelect(String searchTerm) {
		blogArchivesDropDown.selectByVisibleText(searchTerm);
	}
	
	public void getDynamicBlogSearchedElements(Integer index) {
		dynamicBlogSearchedElements().get(index).getText();
	}

	public void clickDynamicBlogSearchedTitles(Integer index) {
		dynamicBlogSearchedTitles().get(index).click();
	}
	public void getBlogArchivesByIndex(Integer index) {
		blogArchivesDropDown.selectByIndex(index);
	}
	public void getBlogArchivesByVisibleText(String term) {
		blogArchivesDropDown.selectByVisibleText(term);
	}
}
