package setup;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class Helper extends BaseClass {
	@DataProvider(name = "LoginData")
	public Object[][] loginData(Method m) {
		Object[][] obj = { new Object[1], new Object[2] };

		if (m.getName().contains("admin")) {
			obj = new Object[1][2];

			obj[0][0] = "adminUser";
			obj[0][1] = "admin";
		}

		if (m.getName().contains("moderator")) {
			obj = new Object[1][2];

			obj[0][0] = "moderatorUser";
			obj[0][1] = "moderator";
		}

		if (m.getName().contains("classic")) {
			obj = new Object[1][2];

			obj[0][0] = "classicUser";
			obj[0][1] = "classic";
		}

		return obj;
	}
	
	// getPropertyValue alternative version + readPropertyFile
	
//	private Properties prop = null;
//	public void readPropertyFile() {
//		prop = new Properties();
//		try {
//			InputStream input = new FileInputStream("");
//			prop.load(input);
//			System.out.println(prop.getProperty("username"));
//			System.out.println(prop.getProperty("password"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public String getPropertyValue2 (String key) {
//		return prop.getProperty(key);
//	}
	//FileInputStream PROPERTY_FILE_PATH_LOGIN_ERRORS = new FileInputStream("E:\\Zarko\\QA Bootcamp\\config.properties");
	
	
	}

