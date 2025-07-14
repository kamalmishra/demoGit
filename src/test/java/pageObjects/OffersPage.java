package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OffersPage {
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By offersProduct=By.cssSelector("tr td:nth-child(1)");
	
	public String getOffersPageProduct() {
		return driver.findElement(offersProduct).getText();
	}
	

}
