package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddmediaToCamp {
	
	private static WebElement element = null;
	
	
	public static WebElement SeleCity(WebDriver driver){
	element=driver.findElement(By.xpath(".//*[@id='filterCityList_chzn']"));
		return element;
	}
	public static WebElement SelCityName(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='filterCityList_chzn_o_1']"));
		return element;
	}
	public static WebElement SelMed(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='streetMediaFilterPopUp']/div[1]/div[1]/div[2]/div[1]/p"));
		return element;
	}
	public static WebElement MediaTyp(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='filterMediaType']/li[2]"));
		return element;
	}
	public static WebElement ClickGO(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='searchMediasByFilter']"));
return element;	
	}
}