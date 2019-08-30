package pageObjects.Pages.About;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Forum extends BaseClass {

	// Elements

	private static List<WebElement> forumObjects() {
		return driver.findElements(By.cssSelector("table.forumTable tr"));
	}

	private static WebElement forumMailIconSubscribe() {
		return driver.findElement(By.cssSelector("span.iconochive-email"));
	}

	// Methods for Interactions

	public void getForumObjectsText(Integer index) {
		forumObjects().get(index).getText();
	}

	public void clickForumObjectsText(Integer index) {
		forumObjects().get(index).click();
	}

	public void clickForumMailIconSubscribe() {
		forumMailIconSubscribe().click();
	}
}
