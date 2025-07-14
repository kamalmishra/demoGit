package stepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	WebDriver driver;
	public String landingPageproductName;
	public String offersPageproductName;
	TestContextSetup testcontextSetup;
	PageObjectManager pom;
	LandingPage lp;
   
	public LandingPageStepDefinition(TestContextSetup testcontextSetup) {
		this.testcontextSetup=testcontextSetup;
		this.lp=testcontextSetup.pom.getLandingPage();
		
	}
	
	@Given("User is on greencart landing page")
	public void user_is_on_greencart_landing_page() throws IOException {
		Assert.assertTrue(lp.getTitleLandingPage().contains("GreenKart"));
	}
	@When("^User searched with shortname (.+) and expected actual name of product$")
	public void user_searched_with_shortname_and_expected_actual_name_of_product(String shortName) throws InterruptedException {
		lp.searchItem(shortName);
		Thread.sleep(2000);
		testcontextSetup.landingPageproductName = lp.getProductItem().split("-")[0].trim();
		System.out.println(testcontextSetup.landingPageproductName);
	}
	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity) throws InterruptedException {
		lp.incrementQuantity(Integer.parseInt(quantity));
		Thread.sleep(2000);
		lp.addCart();
	}
	@When("Added {string} items of the selected product to cart")
	public void Added_items_products(String quantity) throws InterruptedException {
		lp.incrementQuantity(Integer.parseInt(quantity));
		Thread.sleep(2000);
		lp.addCart();
	}
	
}
