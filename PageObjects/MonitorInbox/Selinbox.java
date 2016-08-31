package MonitorInbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selinbox {
	private static WebElement element = null;
	public static WebElement ClickInbox(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//a[contains(@href,'/monitor-view/inbox')]"));
		 
	 
		return element;
	}
}
