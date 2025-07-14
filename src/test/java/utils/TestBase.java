package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	WebDriver driver;
	
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties pop=new Properties();
		pop.load(fis);
		String url=pop.getProperty("qaUrl");
		String browser_properties=pop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		//result= testCondition ? value1 : value2;//java ternary operator.
		String browser= browser_maven!=null  ? browser_maven : browser_properties;
		
		if(driver==null) {
		if(browser.equalsIgnoreCase("chrome"))	{
		driver  = new ChromeDriver();
		
		}
		if(browser.equalsIgnoreCase("firfox")) {
			driver  = new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("edge")){
			driver  = new EdgeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(url);
		}
		return driver;
	}

}
