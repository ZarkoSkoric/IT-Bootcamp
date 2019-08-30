package pageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class UploadPage extends BaseClass {

	// Elements
	
	private static WebElement uploadFilesButton() {
		return driver.findElement(By.cssSelector("a.btn-success"));
	}

	private static WebElement uploadLiveMusicArchiveButton() {
		return driver.findElement(By.cssSelector("span.iconochive-question-dark"));
	}

	// Methods for Interactions
	
	public void clickUploadFilesButton() {
		uploadFilesButton().click();
	}

	public void clickUploadLiveMusicArchiveButton() {
		uploadLiveMusicArchiveButton().click();
	}
}
