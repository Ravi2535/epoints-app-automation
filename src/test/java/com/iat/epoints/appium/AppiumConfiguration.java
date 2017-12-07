package com.iat.epoints.appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.core.env.Environment;
import org.unitils.thirdparty.org.apache.commons.io.FileUtils;

import com.iat.epoints.pages.test.constants.GlobalConstantsTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * This class contains all the required Appium configurations for Android and
 * screenshot method which will capture the activity when called.
 * 
 * @author Ravi2535
 * 
 */


public class AppiumConfiguration {

	private static WebDriver webDriver;
	private static File file;
	DesiredCapabilities capabilities;
	private static AppiumDriver<MobileElement> driver;

	/**
	 * This method, the appium and android driver is getting loaded.
	 * 
	 * @param env
	 *            loads the properties required for appium configuration
	 * @return
	 * @throws MalformedURLException
	 */
	public AppiumDriver<MobileElement> getAppiumDriver(Environment env) throws MalformedURLException {
		if (driver == null) {
			PropertyConfigurator.configure(
					this.getClass().getClassLoader().getResource(GlobalConstantsTest.LOG4J_PROPERTY).getFile());
			driver = new AndroidDriver<MobileElement>(new URL(env.getProperty(GlobalConstantsTest.APPIUM_HOST)),
					capabilities);
			driver.manage().timeouts().implicitlyWait(GlobalConstantsTest.VALUE_TWENTY, TimeUnit.SECONDS);
			webDriver = new Augmenter().augment(driver);
			return driver;
		} else {
			return driver;
		}
	}

	/**
	 * This method takes the screenshot of the activity performed by the user.
	 * 
	 * @param ImageName
	 *            - name of the screen shot
	 * @throws IOException
	 */
	public void screenShot(String ImageName) throws IOException {
		file = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(ImageName + GlobalConstantsTest.PNG));
	}

}
