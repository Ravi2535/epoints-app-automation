package com.iat.epoints.pages.test.runner;
/**
 * This java file enables the connection to the features files and finds respective tests path.
 * 
 * @author Ravi2535
 *
 */


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/features"}, glue={"com.iat.epoints.pages.test"})
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
