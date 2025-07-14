package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String landingPageproductName;
	public PageObjectManager pom;
    public TestBase testbase;
    public GenericUtils genUtils;
	
	
	public TestContextSetup() throws IOException {
		testbase=new TestBase();
		pom=new PageObjectManager(testbase.WebDriverManager());
		genUtils=new GenericUtils(testbase.WebDriverManager());
	}

}
