package com.redbus.TestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.app.redbus.TestBase;
import com.app.redbus.utility.XLs_DataProvider;
import com.redbus.pages.HomePage;
import com.redbus.pages.LoginIn;

public class LoginINTest extends TestBase {
	
	HomePage hp;
	LoginIn rp;
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser(null);
			hp = new HomePage(driver);
			rp = new LoginIn (driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		
		@Test(priority='1', dataProvider="testdata")
		public void testregisterUser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException
		{
			hp.clickonMyAccount();
			hp.clickonLogin ();
			String num = null;
			rp.LogInuser(num);
		}
		
		@DataProvider(name="testdata")
		public Object[][] datasupplier() throws EncryptedDocumentException, IOException
		{
			
			Object[] [] input = XLs_DataProvider.getTestData("Sheet1");
			return input;
			
		}
		
		
		
		
		
		

}
