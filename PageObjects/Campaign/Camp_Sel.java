package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Camp_Sel {
	private static WebElement element = null;
	public static WebElement Clk_menu(WebDriver driver){
		element=driver.findElement(By.xpath("//a[@id='usrUtils']"));
		return element;
	}
	public static WebElement Sel_Camp(WebDriver driver){
		element=driver.findElement(By.linkText("Campaigns"));
		return element;
}
	}
