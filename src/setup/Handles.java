package setup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Handles extends BaseClass {

	public String getChildWindowUrl() {
		Set<String> window = getWebDriver().getWindowHandles();
		Iterator iterator = window.iterator();
		String currentWindowId = null;
		String mainPage = getWebDriver().getWindowHandle();
		while (iterator.hasNext()) {
			currentWindowId = iterator.next().toString();
			// Takes the url from child window
			if (!currentWindowId.equals(mainPage)) {
				getWebDriver().switchTo().window(currentWindowId);
			}
		}
		return getWebDriver().getCurrentUrl();
	}

	public WebDriver getWindowHandles2() {
		Set<String> list = driver.getWindowHandles();
		String mainWindow = null;
		for (String tab : list) {
			driver.switchTo().window(tab);
			if (driver.getCurrentUrl().contains("homeUrl") || driver.getCurrentUrl().contains("second")) {
				mainWindow = tab;
			} else {
				driver.close();
			}
		}
		return driver.switchTo().window(mainWindow);
	}

	String list1 = driver.getWindowHandle();
}