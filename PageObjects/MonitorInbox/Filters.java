package MonitorInbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Filters {
	private static WebElement element = null;
	public static WebElement SelFilters(WebDriver driver){
		element=driver.findElement(By.xpath("//span[@id='getfilterBox']"));
		return element;
	}
	public static WebElement ImageSource(WebDriver driver){
	  element=driver.findElement(By.xpath("//input[@id='filtrImgSrc']"));
	  return element;
	}
	 
	
	public static WebElement MediaLinked(WebDriver driver){
	   element=driver.findElement(By.xpath("//select[@id='filtrMediaLink']"));
	   Select se=new Select(element);
		se.selectByValue("1");
		return element;
	}
	public static  WebElement  MediaId(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[contains(@id,'filtrMId')]"));
		return element;
	}
	public static WebElement Group(WebDriver driver) {
		element=driver.findElement(By.xpath("//select[@id='selMediaGroups']"));
		Select se=new Select(element);
		se.selectByValue("8");
		return element;
		
	}
	public static WebElement MediaType(WebDriver driver){
		return element=driver.findElement(By.xpath("//input[@id='filtrMtype']"));
		
	}
	public static WebElement Campaign(WebDriver driver){
		element=driver.findElement(By.xpath("//select[@id='filtrCampaign']"));
		Select se=new Select(element);
		se.selectByValue("1470");
		return element;
	}
	public static WebElement City(WebDriver driver){
		return element=driver.findElement(By.xpath("//input[@id='filtrCity']"));
	}
	public static WebElement Place(WebDriver driver){
		element= driver.findElement(By.xpath("//select[@id='filtrPlace']"));
		Select se=new Select(element);
		se.selectByValue("2584");
		return element;
	}
	public static WebElement Alert(WebDriver driver){
		element= driver.findElement(By.xpath("//select[@id='filtrAlert']"));
		Select se=new Select(element);
		se.selectByValue("177");
		return element;
	}
	public static WebElement Tag(WebDriver driver){
		element=driver.findElement(By.xpath("//select[@id='filtrTags']"));
		Select se=new Select(element);
		se.selectByValue("168");
		return element;
	}
	public static WebElement ApplyFilter(WebDriver driver){
		element=driver.findElement(By.xpath("//span[@id='applyFilter']"));
		return element;
	}
}
