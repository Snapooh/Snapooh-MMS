package MonitorInbox;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFiles {
	 
 
	private static WebElement element = null;
	
	public static WebElement Download_Image(WebDriver driver) throws InterruptedException{
		element=driver.findElement(By.id("downLoadImg"));
		 
				driver.findElement(By.xpath("html/body/div[2]/div[16]/ul/li[2]")).click();
				Thread.sleep(5000);
		return element;
	
	}
	public static WebElement Download_PDF(WebDriver driver) throws InterruptedException{
		element= driver.findElement(By.cssSelector("#generateMonitorPdf"));
		driver.findElement(By.cssSelector("#makePdf")).click();
		return element;
	}
	
	public static WebElement Download_XL(WebDriver driver) throws AWTException, InterruptedException{
		element=driver.findElement(By.className("formHiddenBtn"));
		return element;
	}
	
	
	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile fprofile = new FirefoxProfile();
		  //Set Location to store files after downloading.
		  fprofile.setPreference("browser.download.dir", "D:\\WebDriverdownloads");
		  fprofile.setPreference("browser.download.folderList", 2);
		  //Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
		  fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    " application/excel,application/vnd.ms-excel,application/x-excel,application/x-msexcel;"//MIME types Of MS Excel File.
		    + "application/pdf;" //MIME types Of PDF File.
		    + "application/x-compressed,application/x-zip-compressed,application/zip,multipart/x-zip"); //MIME types Of Zip File.
		  fprofile.setPreference( "browser.download.manager.showWhenStarting", false ); 
		  fprofile.setPreference( "pdfjs.disabled", true );
		  //Pass fprofile parameter In webdriver to use preferences to download file.
		  FirefoxDriver driver = new FirefoxDriver(fprofile); 
		return fprofile;  

	}	 

	
}
