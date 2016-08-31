	package Campaign;

	import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Create_Campaign {
		private static WebElement element = null;
	public static WebElement ClickOnCreateCamp(WebDriver driver){
	element=driver.findElement(By.cssSelector(".addHolder.getCampaignPopup"));
		return element;
	}
	public static WebElement CampaignNa(WebDriver driver){
		element=driver.findElement(By.id("campnNameInput"));
		return element;
	}
	public static WebElement ClientName(WebDriver driver){
		element=driver.findElement(By.id("campnClientNameInput"));
		return element;
	}
	public static WebElement CampDesc(WebDriver driver){
		element=driver.findElement(By.id("campnDescInput"));
		driver.findElement(By.xpath(".//*[@id='campnStartInput']")).click();
  		WebElement   datepicker = driver.findElement(By.id("ui-datepicker-div"));  
   		List<WebElement> rows=  datepicker.findElements(By.tagName("tr"));  
  		List<WebElement> columns= datepicker.findElements(By.tagName("td"));  
  							
  						for (WebElement cell: columns){  
  							//Select 20th Date   
  							if (cell.getText().equals("29")){  
  								cell.findElement(By.linkText("29")).click();   
  									break;
  							}  
  								}   
  			
  						driver.findElement(By.xpath(".//*[@id='campnEndInput']")).click();
  						WebElement   datepicker1 = driver.findElement(By.id("ui-datepicker-div"));  
  						List<WebElement> rows1=  datepicker1.findElements(By.tagName("tr"));  
  						List<WebElement> columns1= datepicker1.findElements(By.tagName("td"));  
  						for (WebElement cell: columns1){  
	      				//Select 20th Date   
  							if (cell.getText().equals("29")){  
  								cell.findElement(By.linkText("29")).click();   
  									break;
  							}  
  								}   
  				
		
		return element;
	}
	 
	public static WebElement Submit(WebDriver driver){
		element=driver.findElement(By.id("createAndUpdateCampaign"));
		return element;
	}
}
