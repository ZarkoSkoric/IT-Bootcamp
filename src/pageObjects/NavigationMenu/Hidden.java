package pageObjects.NavigationMenu;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Hidden extends BaseClass {

	// Elements

	private static WebElement navHSearchBoxWeb() {
		return driver.findElement(By.id("nav-wb-url"));
	}

	private static List<WebElement> navHWidgetIcon() {
		return driver.findElements(By.cssSelector("div.widgets a"));
	}

	private static List<WebElement> navHFeaturedList() {
		return driver.findElements(By.cssSelector("div.col-sm-2.col-sm-push-4 a"));
	}

	private static List<WebElement> navHTopList() {
		return driver.findElements(By.cssSelector("div.col-sm-2.col-sm-push-2 a"));
	}

	private static List<WebElement> navHOtherList() {
		return driver.findElements(By.cssSelector("div.linx.linx-topped a"));
	}

	// Methods for interactions
	
	public void navHsearchBoxClick() {
		navHSearchBoxWeb().click();
	}

	public void navHSearchBoxInput(String searchTerm) {
		navHSearchBoxWeb().sendKeys(searchTerm);
	}
	public void navHSearchBoxEnter() {
		navHSearchBoxWeb().sendKeys(Keys.ENTER);
	}
	
	public void clickNavHWidgetIcon(Integer index) {
		navHWidgetIcon().get(index).click();
	}

	public void getNavHFeaturedList(Integer index) {
		navHFeaturedList().get(index).getText();
	}

	public void getNavHTopList(Integer index) {
		navHTopList().get(index).getText();
	}

	public void getNavHOtherList(Integer index) {
		navHOtherList().get(index).getText();
	}

	public void clickFeaturedListNavH(Integer index) {
		navHFeaturedList().get(index).click();
	}

	public void clickTopListNavH(Integer index) {
		navHTopList().get(index).click();
	}

	public void clickOtherListNavH(Integer index) {
		navHOtherList().get(index).click();
	}
}