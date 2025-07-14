package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage cp;
	TestContextSetup testcontextSetup;
	
	public CheckoutPageStepDefinition(TestContextSetup testcontextSetup) {
		this.testcontextSetup=testcontextSetup;
		this.cp = testcontextSetup.pom.getCheckoutPage();
	}
	@Then("verify user has ability to enter promo code and place the order")
	public void  verify_user_has_ability_enter_promo()
	{
		
		Assert.assertTrue(cp.verifyPromobtn());
		System.out.println(cp.verifyPromobtn());
		Assert.assertTrue(cp.verifyplaceOrderbtn());
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		
	}

	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException
	{
		
		cp.checkoutItem();
		//Assertion to extract name from screen and compare with name
		String expProductName=cp.getProdutName().split("-")[0].trim();
		System.out.println(expProductName);
		Assert.assertEquals(testcontextSetup.landingPageproductName, expProductName);
	}
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout1(String name) throws InterruptedException
	{
		
		cp.checkoutItem();
		//Assertion to extract name from screen and compare with name
		String expProductName=cp.getProdutName().split("-")[0].trim();
		System.out.println(expProductName);
		Assert.assertEquals(testcontextSetup.landingPageproductName, expProductName);
	}

}
