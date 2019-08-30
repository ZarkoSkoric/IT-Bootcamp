package pageObjects.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.BaseClass;

public class Donate extends BaseClass {

	// Elements
	private static List<WebElement> donateDollarAmountExact() {
		return driver.findElements(By.cssSelector("ul.donationlevel span.hit-area"));
	}
	
	private static WebElement donateOtherAmountBox() {
		return driver.findElement(By.cssSelector("input#amount_custom"));
	}
	
	
	// Methods for Interactions
	public void clickDonateDollarAmountExact(Integer index) {
		donateDollarAmountExact().get(index).click();
	}
	public void donateOtherAmountInput() {
		donateOtherAmountBox().sendKeys("13");
	}
	public void clickDonateOtherAmount() {
		donateOtherAmountBox().click();
	}
	
}
