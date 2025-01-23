package com.crm.qa.testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage; 
//	login page initialize hare so that method can use
	
	public LoginPageTest() {
		super();
		
//		this super function call the constructor of the parent class while the object of this class created
	}
	
	 
//	https://github.com/naveenanimation20/PageObjectModel/blob/master/src/main/java/com/crm/qa/base/TestBase.java
	
	
	
	@BeforeMethod
	public void setup()
	{
	System.out.println("setup started");
initialization();
loginpage =new LoginPage();

		
	}
	
	@Test
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateCrmTitle();
		Assert.assertEquals(title,"Free CRM software for customer relationship management, sales, and support.");
	}
	
	
	@Test
	public void loginPageCrmLogoTest() {
		boolean flag =loginpage.validateCrmLogo();
		 Assert.assertTrue(flag);
	}
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		// in LoginPage.java login method return home page object
		homePage=loginpage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		
//		Thread.sleep(Duration.ofSeconds(10));
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
