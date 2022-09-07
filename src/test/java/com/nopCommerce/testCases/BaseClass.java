package com.nopCommerce.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.nopCommerce.utilities.reconfig;

public class BaseClass {
	
	reconfig read = new reconfig();
	
	public String url= read.getURL();
	public String username= read.getUsername();
	public String password=read.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		logger=Logger.getLogger("nopCommerce");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\Chrome Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
