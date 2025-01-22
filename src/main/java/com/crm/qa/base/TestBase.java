package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
 

	public static WebDriver driver;
	public static Properties prop;


	public TestBase()
	{
		try
		{
			prop= new Properties();
			FileInputStream ip =new FileInputStream("C:\\Users\\Alpha_320\\eclipse-workspace\\FullFrameworkTest\\src\\main\\java\\config.properties");
			prop.load(ip)	;
			System.out.println("prperties file reading");

		}catch (FileNotFoundException e)
		{
		
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver =new ChromeDriver();
			System.out.println("chrome browser lanched");
		}
		else if(BrowserName.equals("FF")) 
		{
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver =new ChromeDriver();
		}
		driver.manage().window().maximize();
		System.out.println("Windows maximised");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.get(prop.getProperty("url"));
		System.out.println("getting url");
		
	}

}
