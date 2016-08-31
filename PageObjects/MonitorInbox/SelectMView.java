package MonitorInbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectMView {
	private static WebElement element = null;
	public static WebElement SelMenu(WebDriver driver){
		element=driver.findElement(By.xpath("//a[@id='usrUtils']"));
		return element;
	}
	public static WebElement SelMview(WebDriver driver){
		//element=driver.findElement(By.xpath("//a[contains(@href,'/sptest/mo/monitor/report/mediawise')]"));
		element=driver.findElement(By.xpath("//a[contains(@href,'/mo/monitor/report/mediawise')]"));
		return element;
	}
}
