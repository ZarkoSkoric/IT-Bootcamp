package pageObjects.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class People extends BaseClass {

	// Elements

	private static List<WebElement> peopleObjectsList() {
		return driver.findElements(By.cssSelector("div.bio div"));
	}

	private static List<WebElement> peopleNameAndTitleList() {
		return driver.findElements(By.cssSelector("div.bio b"));
	}

	// Methods for Interactions

	public void getPeopleObjectsList(Integer index) {
		peopleObjectsList().get(index).getText();
	}

	public void getPeopleNameAndTitleList(Integer index) {
		peopleNameAndTitleList().get(index).getText();
	}

}