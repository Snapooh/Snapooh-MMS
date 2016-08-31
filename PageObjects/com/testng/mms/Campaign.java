package com.testng.mms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Campaign.Create_Campaign;
import Campaign.Login_page;
import Campaign.Camp_Sel;

public class Campaign {
	public WebDriver  driver=new FirefoxDriver();
	
@BeforeTest
public void launch_Browser(){
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //Launch The browser With Valid Url
    driver.get("http://192.168.1.10:8080/sptest/home.html");
   // driver.get("http://snapooh.com/home");
    driver.manage().window().maximize();
   
}
	@Test
public void Login(){
		Login_page.Log_Btn(driver).click();
		Login_page.Log_Uname(driver).sendKeys("velubala17@gmail.com");
		Login_page.Log_pwd(driver).sendKeys("12345678");
		Login_page.Log_BClk(driver).click();
}

		@Test
public void Selct_Campaign(){
	Camp_Sel.Clk_menu(driver).click();
	Camp_Sel.Sel_Camp(driver).click();
}

			@Test
public void Create_Campaign(){
				WebDriverWait wait = new WebDriverWait(driver, 20);
				WebElement element = wait.until(ExpectedConditions.elementToBeClickable( Create_Campaign.ClickOnCreateCamp(driver)));
	 
     Create_Campaign.CampaignNa(driver).sendKeys("Campaign");
     Create_Campaign.ClientName(driver).sendKeys("Client");
     Create_Campaign.CampDesc(driver).sendKeys("Desc");
    // Create_Campaign.CampStartdura(driver).click();
     //Create_Campaign.CampEndDur(driver).click();
     Create_Campaign.Submit(driver).click();
     System.out.println("Campaign Created");
	
}

@AfterTest
public void Terminate_browser(){
	//driver.quit();
}
}
