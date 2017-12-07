package com.iat.epoints.pages.test;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.iat.epoints.appium.AppiumConfiguration;
import com.iat.epoints.pages.SignupPage;
import com.iat.epoints.pages.test.constants.GlobalConstantsTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



/**
 * This class initiate the appium configuration, executes the all test scenarios which are mentioned in BDD
 * and after successful execution of test cases it prompts success message
 * @author Ravi2535
 *
 */

@TestPropertySource("classpath:application.properties")
@ContextConfiguration(classes = { Properties.class })
 public class SignupTest extends AbstractTestNGSpringContextTests {
	
	@Autowired
	Environment env;
	
	Logger log = Logger.getLogger(SignupTest.class);
	
	
	/**
	 * This method is configuring the Appium driver when the user is on the signup page.
	 * @throws Throwable
	 */
	@Given("^User navigate to signup page$")
	public void user_navigate_to_signup_page() throws Throwable {
		new AppiumConfiguration().getAppiumDriver(env);
	    log.info(GlobalConstantsTest.LAUNCH);
	}

	
	/**
	 * This method accesses each and every details provided by user and and takes screenshots after every entry. 
	 * @param details
	 * @throws Throwable
	 */
	@When("^User enters details to signup$")
	public void user_enters_details_to_signup(List<UserData> details) throws Throwable {
		new SignupPage().executeAutomation(details);
	}

	
	/**
	 * This method displays a message for successful registration.
	 * @throws Throwable
	 */
	@Then("^message displayed registered successfully$")
	public void message_displayed_registered_successfully() throws Throwable {
		log.info(GlobalConstantsTest.SUCCESS);
	}

	
}
