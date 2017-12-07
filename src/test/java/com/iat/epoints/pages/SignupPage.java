package com.iat.epoints.pages;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.springframework.core.env.Environment;

import com.iat.epoints.appium.AppiumConfiguration;
import com.iat.epoints.pages.test.UserData;
import com.iat.epoints.pages.test.constants.GlobalConstantsTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
/**
 * This class fetches all BDD scenarios and mobile element locators exist in feature files
 * To write the values into signup page fields 
 * 
 * @Ravi2535
 */
public class SignupPage extends AppiumConfiguration {
	Logger log = Logger.getLogger(SignupPage.class);
	static AppiumDriver<MobileElement> driver;
	Environment env;
/**
 * This method fetches the details for every field from user and takes as screenshot of the activity after every entry
 * @param details - holds signup page mobile elements locators and their respective values
 * @throws IOException
 */
	public void executeAutomation(List<UserData> details) throws IOException {
		driver = getAppiumDriver(env);
		for (UserData user : details) {
			driver.findElement(By.id(user.getEmailPath())).sendKeys(user.getEmail());
			screenShot(GlobalConstantsTest.EMAIL);
			log.info(GlobalConstantsTest.EMAIL);
			driver.findElement(By.id(user.getPasswordPath())).sendKeys(user.getPassward());
			screenShot(GlobalConstantsTest.PWD);
			log.info(GlobalConstantsTest.PWD);
			driver.findElement(By.id(user.getFirstNamePath())).sendKeys(user.getFirstName());
			screenShot(GlobalConstantsTest.FNAME);
			log.info(GlobalConstantsTest.FNAME);
			driver.findElement(By.id(user.getLastNamePath())).sendKeys(user.getLastName());
			screenShot(GlobalConstantsTest.LNAME);
			log.info(GlobalConstantsTest.LNAME);
			driver.findElement(By.id(user.getPromoCodePath())).sendKeys(user.getPromoCode());
			driver.findElement(By.id(user.getSubmittPath())).click();
			screenShot(GlobalConstantsTest.SUBMIT);
			log.info(GlobalConstantsTest.SUBMIT);
		}
	}
}
