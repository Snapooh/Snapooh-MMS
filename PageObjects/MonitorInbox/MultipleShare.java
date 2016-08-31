package MonitorInbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleShare {
	private static WebElement element = null;
	public static WebElement ClickShare(WebDriver driver){
		element=driver.findElement(By.id("appplyMultipleShare"));
		driver.findElement(By.id("shareMultipleMedia")).click();
		driver.findElement(By.id("multiSharingID")).sendKeys("jagannatham66@gmail.com");
		return element;
	}
}
