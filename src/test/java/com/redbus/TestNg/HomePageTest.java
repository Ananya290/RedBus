package com.redbus.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.app.redbus.TestBase;
import com.redbus.pages.HomePage;






public class HomePageTest extends TestBase{
	
HomePage hp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser(null);
		hp = new HomePage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(priority='1')
	public void testTitle()
	{
		hp.gettitle();
	}
	
	@Test(priority='2')
	public void testLOGINLink1()
	{
		hp.clickonMyAccount();  // on homapge click on myaccount
		hp.clickonLogin();  // clcik on register
		hp.gettitle();  // get title
	}
	
	public void testLOGINLink()
	{
		hp.clickonMyAccount();  // on homapge click on myaccount
		hp.clickonLogin();  // clcik on register
		hp.gettitle();  // get title
	}
	
}
	