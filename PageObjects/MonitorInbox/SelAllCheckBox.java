package MonitorInbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelAllCheckBox {
	private static WebElement element = null;
	public static WebElement Select_The_CheckBox_from_List(WebDriver driver ) throws InterruptedException {
 
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
		    driver.findElement(By.xpath("id('getCalPicker')")).click();
		    Thread.sleep(6000);
		  //Click on next so that we will be in next month
		    driver.findElement(By.xpath("//input[@id='mInputFrom']")).click();
	  		WebElement   datepicker = driver.findElement(By.id("ui-datepicker-div"));  
	   		List<WebElement> rows=  datepicker.findElements(By.tagName("tr"));  
	  		List<WebElement> columns= datepicker.findElements(By.tagName("td"));  
	  							
	  						for (WebElement cell: columns){  
	  							//Select 20th Date   
	  							if (cell.getText().equals("1")){  
	  								cell.findElement(By.linkText("1")).click();   
	  									break;
	  							}  
	  								}   
	  			
	  						driver.findElement(By.xpath("//input[@id='mInputTo']")).click();
	  						WebElement   datepicker1 = driver.findElement(By.id("ui-datepicker-div"));  
	  						List<WebElement> rows1=  datepicker1.findElements(By.tagName("tr"));  
	  						List<WebElement> columns1= datepicker1.findElements(By.tagName("td"));  
	  						for (WebElement cell: columns1){  
		      				//Select 20th Date   
	  							if (cell.getText().equals("2")){  
	  								cell.findElement(By.linkText("2")).click();   
	  									break;
	  							}  
	  								}   
	  				
			
			return element;
		}
		 
		     
		    driver.findElement(By.id("searchByDate")).click();
		    Thread.sleep(6000);
			return element;
		
	}
	public static WebElement Select_Actions(WebDriver driver ) {
		element=driver.findElement(By.xpath("//span[contains(@id,'getActionBox')]"));
		return element;
	
}
}
