package MonitorInbox;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Campaign.Login_page;

public class Inbox {
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, AWTException {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch The browser With Valid Url
		// driver.get("http://192.168.1.10:8080/sptest/home.html");
		driver.get("http://snapooh.com/home");
		driver.manage().window().maximize();
		// Use page Object library now


		//Login With The Valid Credentials
		Login_page.Log_Btn(driver).click();
//		     Login_page.Log_Uname(driver).sendKeys("abc@snapooh.com");
//			     Login_page.Log_pwd(driver).sendKeys("87654321");
		Login_page.Log_Uname(driver).sendKeys("ajay.dhiman@timesgroup.com");
		Login_page.Log_pwd(driver).sendKeys("timeswestern");
		Login_page.Log_BClk(driver).click();
		System.out.println("Login to the Page Done");

		//Select the Monitor view inbox page from menu

		SelectMView.SelMenu(driver).click();
		SelectMView.SelMview(driver).click();
		System.out.println("Monitor view  Page Selected");

		Selinbox.ClickInbox(driver).click();
		System.out.println(	
				"Monitor Inbox Clicked");

//		SelAllCheckBox.Select_The_CheckBox_from_List(driver).click();
//		System.out.println("Select all checkbox clicked");
//		SelAllCheckBox.Select_Actions(driver).click();
//		System.out.println("Actions Clicked");
//		
//		DownloadFiles.Download_Image(driver).click();
//		System.out.println("Downloaded a Image file for selected files");
// 
//		
//		DownloadFiles.Download_PDF(driver).click();
//		System.out.println("Pdf File Button Cliked");
//		 
//		
//		DownloadFiles.Download_XL(driver).click();
//		System.out.println("XL File Button Cliked");
// 
//		
//		MultipleShare.ClickShare(driver).click();
//		System.out.println("Share a Multiple monitors with the for Same mail id");
//		showMoreMonitor.SelShowMore(driver).click();
		Filters.SelFilters(driver).click();
		Filters.ImageSource(driver).sendKeys("Insign Adds");
		Filters.MediaLinked(driver).click();
		Filters.MediaId(driver).click();
		Filters.Group(driver).click();
		Filters.MediaType(driver).sendKeys("");
		Filters.Campaign(driver).click();
		Filters.City(driver).sendKeys("");
		//Filters.Place(driver).click();
		Filters.Alert(driver).click();
		Filters.Tag(driver).click();
		Filters.ApplyFilter(driver).click();

	}
}
