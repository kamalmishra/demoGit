package stepDefinitions;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OffersPageStepDefinition {
	WebDriver driver;
	public String landingPageproductName;
	public String offersPageproductName;
	TestContextSetup testcontextSetup;
	PageObjectManager pom;
	
	
	
	public OffersPageStepDefinition(TestContextSetup testcontextSetup) {
		this.testcontextSetup=testcontextSetup;
	}
	
	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
		LandingPage lp=testcontextSetup.pom.getLandingPage();
		OffersPage op=testcontextSetup.pom.getOffersPage();
	  switchToOffersPage();
	  lp.searchItem(shortName);
	  Thread.sleep(2000);
	  offersPageproductName=op.getOffersPageProduct();
	}
	public void switchToOffersPage() {
		LandingPage lp=testcontextSetup.pom.getLandingPage();
		  lp.clickOnTopDeals();
		  testcontextSetup.genUtils.switchToChidWin();
	}
	
	@Then("Validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	    Assert.assertEquals(offersPageproductName, testcontextSetup.landingPageproductName);
	}

}
