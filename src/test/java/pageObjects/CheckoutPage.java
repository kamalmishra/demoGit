package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage( WebDriver driver) {
		this.driver=driver;
	}
	
	By cartbag=By.xpath("//img[@alt='Cart']");
	By proCheckout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By applypromo=By.cssSelector(".promoBtn");
	By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	By productName=By.cssSelector(".product-name");
	
	public void checkoutItem() {
		driver.findElement(cartbag).click();
		driver.findElement(proCheckout).click();
	}
	
	public boolean verifyPromobtn() {
		return driver.findElement(applypromo).isDisplayed();
	}
	public boolean verifyplaceOrderbtn() {
		return driver.findElement(placeOrder).isDisplayed();
	}
	public String getProdutName() {
		return driver.findElement(productName).getText();
	}
	
}
