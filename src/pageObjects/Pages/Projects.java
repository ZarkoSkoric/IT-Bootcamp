package pageObjects.Pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Projects extends BaseClass {

	// Elements

	private static List<WebElement> archiveProjects() {
		return driver.findElements(By.cssSelector("div.col-sm-9 b"));
	}

	// Methods for Interactions

	public void getArchiveProjectText(Integer index) {
		archiveProjects().get(index).getText();
	}

	public void getArchiveProjectSizePrint() {
		System.out.println(archiveProjects().size());
	}

	public int getArchiveProjectSize() {
		return archiveProjects().size();
	}

}
