package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//locater
	private By fname = By.name("firstName");
	private By lname = By.name("lastName");
	private By pin = By.name("postalCode");
	private By conBtn = By.name("continue");
	private By cnsBtn = By.name("cancel");
	
	
	//method
	
	public void cancel()
	{
		driver.findElement(cnsBtn).click();
//		String curl = driver.getCurrentUrl();
//		return curl; 
	}
	
	public void doContinue(String firstName, String lastName, String pincode)
	{
		driver.findElement(fname).sendKeys(firstName);
		driver.findElement(lname).sendKeys(lastName);
		driver.findElement(pin).sendKeys(pincode);
		driver.findElement(conBtn).click();
		System.out.println("overview page open");
		

	}
	
}
