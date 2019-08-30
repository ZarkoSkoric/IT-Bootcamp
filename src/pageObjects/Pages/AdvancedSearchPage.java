package pageObjects.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.BaseClass;

public class AdvancedSearchPage extends BaseClass {

	// Elements
	
	private static List<WebElement> advSearchSelectContainsList() {
		return driver.findElements(By.cssSelector("div.col-sm-2 select"));
	}

	private static List<WebElement> advSearchInputBoxesRightList() {
		return driver.findElements(By.cssSelector("div.col-sm-7 input"));
	}

	private static List<WebElement> advSearchInputBoxesLeftList() {
		return driver.findElements(By.cssSelector("div.col-sm-2 input"));
	}

	private static List<WebElement> advSearchButtons() {
		return driver.findElements(By.cssSelector("input.btn-primary"));
	}

	// Advanced Search returning JSON, XML, and more

	Select advSearchFieldsToReturnSelect        = new Select(driver.findElement(By.name("fl[]")));
	Select advSearchFieldsOptionalSortResSelect = new Select(driver.findElement(By.name("sort[]")));

	private static WebElement advSearchQueryBox() {
		return driver.findElement(By.name("q"));
	}

	private static WebElement advSearchNumberOfResultBox() {
		return driver.findElement(By.cssSelector("input#numresults"));
	}

	private static WebElement advSearchPageBox() {
		return driver.findElement(By.name("page"));
	}

	private static WebElement advSearchXMLSaveCheckbox() {
		return driver.findElement(By.name("save"));
	}

	private static List<WebElement> advSearchFormatRadioButtons() {
		return driver.findElements(By.name("output"));
	}

	// Methods for Interactions

	public void clickAdvancedSearchSelectContainsList(Integer index) {
		advSearchSelectContainsList().get(index).click();
	}

	public void clickAdvSearchInputBoxesRight(Integer index) {
		advSearchInputBoxesRightList().get(index).click();
	}

	public void advSearchInputBoxesRightInput(Integer index, String searchTerm) {
		advSearchInputBoxesRightList().get(index).sendKeys(searchTerm);
	}
	
	public void clickAdvSearchInputBoxesLeft(Integer index) {
		advSearchInputBoxesLeftList().get(index).click();
	}

	public void advSearchInputBoxesLeftInput(Integer index, String searchTerm) {
		advSearchInputBoxesLeftList().get(index).sendKeys(searchTerm);
	}

	public void clickAdvSearchButtons(Integer index) {
		advSearchButtons().get(index).click();
	}

	// Advanced Search returning JSON, XML, and more

	public void advSearchQueryBoxInput(String searchTerm) {
		advSearchQueryBox().sendKeys(searchTerm);
	}

	public void inputNumberResult(String number) {
		advSearchNumberOfResultBox().sendKeys(String.valueOf(number));
	}

	public void advSearchPageBoxInput(String number) {
		advSearchPageBox().sendKeys(String.valueOf(number));
	}

	public void clickAdvSearchFormatRadioButtons(Integer index) {
		advSearchFormatRadioButtons().get(index).click();
	}

	public void getAdvSearchFieldsOptionalSortResSelect(Integer index) {
		advSearchFieldsOptionalSortResSelect.selectByIndex(index);
	}

	public void getAdvSearchFieldsToReturnSelect(String searchTerm) {
		advSearchFieldsToReturnSelect.selectByVisibleText(searchTerm);
	}

	public void clickAdvSearchXMLSaveChechbox() {
		advSearchXMLSaveCheckbox().click();
	}

}