package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//page factory - Obejct repository 
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	 WebElement SignUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	// initialize the page object
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action 
	public String validateCrmTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean validateCrmLogo() 
	{
		Boolean logo=crmLogo.isDisplayed();
		return logo;
		// return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		return new HomePage();
		
//		this method return the home page object
	}
	
}

