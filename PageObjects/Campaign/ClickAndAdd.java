package Campaign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAndAdd {
	private static WebElement element = null;
	
	public static WebElement ClikApply(WebDriver driver){
	element=driver.findElement(By.xpath(".//*[@id='applyDateRange']"));
	 WebDriverWait wait = new WebDriverWait(driver, 1, 100);
	    wait.until(ExpectedConditions.alertIsPresent());
	Alert simpleAlert = driver.switchTo().alert();
	String alertText = simpleAlert.getText();
	System.out.println("Alert text is " + alertText);
	simpleAlert.accept();
	return element;
		 }
	 
}
