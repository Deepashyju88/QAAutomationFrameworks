package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Encapsulation = private data + public methods
	
	private WebDriver driver;
	
	//initialization driver
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	//Locator
	
	private By un = By.id("user-name");
	private By pw = By.id("password");
	private By LogInBt = By.name("login-button");
	
	
	//method
	
	public String getloginUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getTitle()
	{
		return driver.getTitle(); 
	}
	
	
	public String doLogin(String uname, String pwd)
	{
		
		driver.findElement(un).sendKeys(uname);
		driver.findElement(pw).sendKeys(pwd);
		driver.findElement(LogInBt).click();
		
		String crl = driver.getCurrentUrl();
		return crl;
	}
	
	
	 
	
	
	
	
	
	

}
