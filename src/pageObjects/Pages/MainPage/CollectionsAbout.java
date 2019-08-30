package pageObjects.Pages.MainPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class CollectionsAbout extends BaseClass {

//		// Elements

//		private static List<WebElement> b() {
//			return driver.findElements(By.cssSelector(""));
//		}
	private static List<WebElement> aboutCollectionsDistributorsList() {
		return driver.findElements(By.className("person"));
	}

	private static List<WebElement> aboutCollectionsGrafList() {
		return driver.findElements(By.className("grafs-content"));
	}

	private static List<WebElement> aboutCollRelatedCollectionsList() {
		return driver.findElements(By.className("about-box"));
	}

	private static List<WebElement> aboutCollTopRegionsTableList() {
		return driver.findElements(By.className("table.stats-table tr"));
	}

//		private static WebElement a() {
//			return driver.findElement(By.cssSelector(""));
//		}

//		// Methods for Interactions
//		public void {
//			
//		}

}
