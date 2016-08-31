package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelCamDetail {
		private static WebElement element = null;
	public static WebElement OpenCampPage(WebDriver driver){
		element= driver.findElement(By.className("campaignId"));
		return element;
	}
}
