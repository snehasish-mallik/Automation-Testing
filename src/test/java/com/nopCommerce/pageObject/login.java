package com.nopCommerce.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
protected static WebDriver ldriver;
	
	public login(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement lnkLogout;
	
	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setpassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	

}
