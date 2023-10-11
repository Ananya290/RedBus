package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.redbus.TestBase;



public class HomePage extends TestBase {
	
	Actions a = new Actions(driver);
	// Create PageFactory
	// this code will find the element using xpath locator and store it in webelement object myaccount
	
	@FindBy(xpath = "(//span[@class ='name_rb_secondary_item'])[2]")
	WebElement myaccount;
	
	
	@FindBy(xpath="//li[@id ='user_sign_in_sign_up']")
	WebElement login;
	

	
public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
		
	}

public void gettitle()
{
	String title = driver.getTitle();
	System.out.println(title);
	
}

// method name is similar to action to be done

public void clickonMyAccount()
{
	myaccount.click();
}

public void clickonLogin()
{
	login.click();
}

}
	