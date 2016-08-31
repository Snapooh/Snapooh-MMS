package MonitorInbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class showMoreMonitor {
	public static WebElement SelShowMore(WebDriver driver) throws InterruptedException{
		 
		WebElement element = null;
		try
		{
		    element = driver.findElement(By.id("allMonitors"));
		}
		catch(Exception e)
		{
		}
		if (element != null)
		{
		    driver.findElement(By.xpath("showMoreMonitor")).click();
		 
		 
	}
		return element;
	}
}
