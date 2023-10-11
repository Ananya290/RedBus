package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIn {

	
	@FindBy(xpath="//input[@type='number']")
	WebElement number;
	@FindBy(xpath="//div[@class ='recaptcha-checkbox-border']")
	WebElement checkbox;
	@FindBy(xpath="//span[@class ='f-w-b']")
	WebElement generateotp;
	
	
public LoginIn(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

public void LogInuser(String num) throws InterruptedException {
	
	number.clear();
	number.sendKeys(num);
	checkbox.click();
	Thread.sleep(1000);
	generateotp.click();
	Thread.sleep(1000);
	
	
	
}
	
	
	
}
