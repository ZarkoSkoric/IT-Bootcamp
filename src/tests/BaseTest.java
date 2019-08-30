package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import setup.BaseClass;

public class BaseTest {
	 
	private static WebDriver webDriver;
	protected static BaseClass basePage;
	
//	private static final String APP_URL = "http://store.demoqa.com";
 
	@BeforeTest
	public static void launchApplication(){
		setFirefoxDriverProperty();
		webDriver = new FirefoxDriver();
//		webDriver.get(APP_URL);
		basePage = new BaseClass();
		basePage.setWebDriver(webDriver);
	}
 
	@AfterTest
	public static void closeBrowser(){
		webDriver.quit();
	}
 
	private static void setFirefoxDriverProperty() {
		System.setProperty("webdriver.gecko.driver", "E:\\\\Zarko\\\\QA Bootcamp\\\\Selenium\\\\geckodriver.exe");
	}

}

