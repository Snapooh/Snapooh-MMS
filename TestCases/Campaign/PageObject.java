package Campaign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObject {
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch The browser With Valid Url
		// driver.get("http://192.168.1.10:8080/sptest/home.html");
		driver.get("http://snapooh.com/home");
		driver.manage().window().maximize();
		// Use page Object library now


		//Login With The Valid Credentials
		Login_page.Log_Btn(driver).click();
		//	     Login_page.Log_Uname(driver).sendKeys("velubala17@gmail.com");
		//	     Login_page.Log_pwd(driver).sendKeys("12345678");
		Login_page.Log_Uname(driver).sendKeys("info@snapooh.com");
		Login_page.Log_pwd(driver).sendKeys("12345678");
		Login_page.Log_BClk(driver).click();
		System.out.println("Login to the Page Done");

		//Campaign Selection

		Camp_Sel.Clk_menu(driver).click();
		Camp_Sel.Sel_Camp(driver).click();
		System.out.println("Campaign Page Selected");

		//Create a Campaign
		Create_Campaign.ClickOnCreateCamp(driver).click();
		Create_Campaign.CampaignNa(driver).sendKeys("Campaign");
		Create_Campaign.ClientName(driver).sendKeys("Client");
		Create_Campaign.CampDesc(driver).sendKeys("Desc");
		// Create_Campaign.CampStartdura(driver).click();
		//Create_Campaign.CampEndDur(driver).click();
		Create_Campaign.Submit(driver).click();
		System.out.println("Campaign Created");

		//Select the Campaign details Page
		SelCamDetail.OpenCampPage(driver).click();
		System.out.println("Campaign Page Selected");

		//Select the Street media Popup and perform the opera
		SelStreetMedia.SelectStreetBut(driver).click();
		System.out.println("Street Button Clicked");

		//Search The Filter from Street Media Popup
		AddmediaToCamp.SeleCity(driver).click();
		AddmediaToCamp.SelCityName(driver).click();
		AddmediaToCamp.SelMed(driver).click();
		AddmediaToCamp.MediaTyp(driver).click();
		AddmediaToCamp.ClickGO(driver).click();
		System.out.println("Street Medias are searched by filter");

		//Select a Media From the Media Selector Popup and click on media with the Photo View Also
		SelMedFromPop.SelMediID(driver).click();
		System.out.println("Select Media From List");

		//SelMedFromPop.PhotoView(driver).click();
		//System.out.println("Select a Photo View");

		//SelMedFromPop.PhotoViewMedia(driver).click();
		//System.out.println("Sel media from Photo View");

		//Apply Date Range and add media to campaign
		ClickAndAdd.ClikApply(driver).click();

		//Quit the Browser
		//  driver.quit();
	}
}
