package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void switchToChidWin() {
		
		  Set<String>win= driver.getWindowHandles();
		  Iterator<String> it= win.iterator();
		  String parentId=it.next();
		  String childId=it.next();
		  driver.switchTo().window(childId);
	}

}
