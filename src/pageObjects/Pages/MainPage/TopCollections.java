package pageObjects.Pages.MainPage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import setup.BaseClass;

public class TopCollections extends BaseClass {

	// Elements
	
	private static List<WebElement> topCollectionsElementsBoxList() { // edit regex?
		return driver.findElements(By.cssSelector("div.C234"));
	}
	
	private static List<WebElement> topCollectionsElementsLinkList() { // edit regex?
		return driver.findElements(By.cssSelector("div.C a"));
	}
	
	private static List<WebElement> topCollectionsTitles() {
		return driver.findElements(By.cssSelector("div.collection-title div"));
	}

	private static List<WebElement> topCollectionsNumItems() {
		return driver.findElements(By.cssSelector("div.num-items.topinblock"));
	}

	// Methods for interactions
	
	public List<WebElement> getTopCollectionsElementsList() {
		return topCollectionsElementsBoxList();
	}
	
	public int getTopCollectionsElementsSize() {
		return getTopCollectionsElementsList().size();
	}
	
	public void clickTopCollectionsElement(Integer index) {
		topCollectionsElementsLinkList().get(index).click();
	}
	
	public String getTopCollectionsElementText(Integer index) {
		return topCollectionsElementsBoxList().get(index).getText();
	}
	
	public void getTopCollectionsAllElementsText(String searchTerm) {
		for (WebElement i : topCollectionsElementsBoxList()) {
			System.out.println(i.getText().toLowerCase()); 
			Assert.assertTrue(i.getText().toLowerCase().contains(searchTerm.toLowerCase()));
		}
	}

	public String getTopCollectionsTitle(Integer index) {
		return topCollectionsTitles().get(index).getText();
	}

	public String getTopCollectionsNumItems(Integer index) {
		return topCollectionsNumItems().get(index).getText();
	}
}
