package com.nopCommerce.testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.nopCommerce.pageObject.login;

public class logintest_01 extends BaseClass {
	
	
	
	@Test
	public void logintest() throws InterruptedException {
		driver.get(url);
		
		logger.info("URL is opened!");
		
		login lp = new login(driver);
		
		lp.setUsername(username);
		
		lp.setpassword(password);
		
		lp.clickLogin();
		
		logger.info("Login is clicked");
		
		Thread.sleep(10000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Assert.assertTrue(true);
//			lp.clickLogout();
			
			logger.info("Login Successfull...");
		}
//		else {
//			Assert.assertTrue(false);
//			logger.info("Login failed..");
//		}
		

	}
	
	

}
