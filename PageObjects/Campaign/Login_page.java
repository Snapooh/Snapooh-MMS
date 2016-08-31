package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	private static WebElement element = null;
public static WebElement Log_Btn(WebDriver driver){
	element=driver.findElement(By.className("loginBtn"));
	return element;
}
public static WebElement Log_Uname(WebDriver driver){
	element=driver.findElement(By.id("emailaddress"));
	return element;
}
public static WebElement Log_pwd(WebDriver driver){
	element=driver.findElement(By.id("loginpassword"));
	return element;
}
public static WebElement Log_BClk(WebDriver driver){
	element=driver.findElement(By.id("loginEnter"));
	return element;
}
}
