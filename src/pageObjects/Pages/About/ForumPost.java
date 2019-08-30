package pageObjects.Pages.About;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class ForumPost extends BaseClass {

	// Elements

	private static WebElement forumPostEdit() {
		return driver.findElement(By.linkText("edit"));
	}

	private static WebElement forumPostReply() {
		return driver.findElement(By.linkText("Reply to this post"));
	}

	private static WebElement forumPostGoBack() {
		return driver.findElement(By.linkText("Go Back"));
	}

	private static WebElement forumPostText() {
		return driver.findElement(By.cssSelector("div.box.well-sm"));
	}

	private static WebElement forumPostReadFullText() {
		return driver.findElement(By.linkText("text."));
	}

	private static WebElement forumPostNewsLink() {
		return driver.findElement(By.linkText("news"));
	}

	// Methods for Interactions

	public void clickForumPostEdit() {
		forumPostEdit().click();
	}

	public void clickForumPostReply() {
		forumPostReply().click();
	}

	public void clickForumPostGoBack() {
		forumPostGoBack().click();
	}

	public void getForumPostText() {
		forumPostText().getText();
	}

	public void clickForumPostReadFullText() {
		forumPostReadFullText().click();
	}

	public void clickForumPostNewsLink() {
		forumPostNewsLink().click();
	}

}