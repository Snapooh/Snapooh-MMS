package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelMedFromPop {
 
		private static WebElement element = null;
	public static WebElement SelMediID(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='searchByListView']/tbody/tr[1]/td[1]") );
		return element;
	}
	public static WebElement PhotoView(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='mapBtn']/a"));
		return element;
	}
	public static WebElement PhotoViewMedia(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='streetMediaSearchResult']/div/div[1]/div/img"));
		return element;
}
}