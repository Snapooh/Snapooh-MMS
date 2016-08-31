package com.testng.mms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Campaign.Login_page;
import MonitorInbox.DownloadFiles;
import MonitorInbox.Filters;
import MonitorInbox.SelAllCheckBox;
import MonitorInbox.SelectMView;
import MonitorInbox.Selinbox;

public class MInbox {

	WebDriver  Inbox=new FirefoxDriver();
	@BeforeTest
	public void launch_Browser(){
		Inbox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch The browser With Valid Url
		// Inbox.get("http://192.168.1.10:8080/sptest/home.html");
		Inbox.get("http://snapooh.com/home");
		Inbox.manage().window().maximize();

	}
	@Test
	public void Login(){
		Login_page.Log_Btn(Inbox).click();
		Login_page.Log_Uname(Inbox).sendKeys("ajay.dhiman@timesgroup.com");
		Login_page.Log_pwd(Inbox).sendKeys("timeswestern");
		Login_page.Log_BClk(Inbox).click();
	}
	@Test
	public void Select_Mview() throws InterruptedException{
		SelectMView.SelMenu(Inbox).click();
		SelectMView.SelMview(Inbox).click();

	}
	@Test
	public void Select_Inbox(){
		Selinbox.ClickInbox(Inbox).click();
	}
	@Test
	public void Select_Chck_Box() throws InterruptedException{
		SelAllCheckBox.Select_The_CheckBox_from_List(Inbox).click();
		SelAllCheckBox.Select_Actions(Inbox).click();

	}
	@Test
	public void InboxFilter(){
		Filters.SelFilters(Inbox).click();
		Filters.ImageSource(Inbox).sendKeys("Insign Adds");
		Filters.MediaLinked(Inbox).click();
		Filters.MediaId(Inbox).click();
		Filters.Group(Inbox).click();
		Filters.MediaType(Inbox).sendKeys("");
		Filters.Campaign(Inbox).click();
		Filters.City(Inbox).sendKeys("");
		Filters.Place(Inbox).click();
		Filters.Alert(Inbox).click();
		Filters.Tag(Inbox).click();
		Filters.ApplyFilter(Inbox).click();
	}
	 

	@AfterTest
	public void End_browser(){
		Inbox.quit();


	}
}
