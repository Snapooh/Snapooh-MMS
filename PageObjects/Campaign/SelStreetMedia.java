package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelStreetMedia {
	private static WebElement element = null;
	public static WebElement SelectStreetBut(WebDriver driver){
	element=driver.findElement(By.id("addNewStreetMedia"));
		return element;
	}
}
