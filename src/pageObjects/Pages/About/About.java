package pageObjects.Pages.About;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class About extends BaseClass {

	// Elements

	private static List<WebElement> newsBoxForum() {
		return driver.findElements(By.cssSelector("table.forumTable tr.forumRow a"));
	}

	private static WebElement moreNewsForumButton() {
		return driver.findElement(By.cssSelector("div.box h1 a"));
	}

	// Methods for interactions

	public void clickNewsBoxForum(Integer index) {
		newsBoxForum().get(index).click();
	}

	public void getNewsBoxForumText(Integer index) {
		newsBoxForum().get(index).getText();
	}

	public void getNewsBoxForumSize() {
		newsBoxForum().size();
	}

	public void clickMoreNewsForumButton() {
		moreNewsForumButton().click();
	}
}
