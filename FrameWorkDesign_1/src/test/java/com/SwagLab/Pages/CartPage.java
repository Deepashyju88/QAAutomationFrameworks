package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage 
{
	private WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//locator
	private By cartpath = By.xpath("//a[@class='shopping_cart_link']");
	private By RemBtn = By.xpath("//button[text()='Remove']");
	private By contBtn = By.xpath("//button[text()='Continue Shopping']");
	private By chekBtn = By.id("checkout");
	
	//methord
	
	public void CartPageOpen()
	{
		driver.findElement(cartpath).click();	
		System.out.println("cart page open");
	}
	
	public void Removeitem()
	{
		driver.findElement(RemBtn);
		System.out.println("removed item sucessfuly");
	}
	
	public void continueShop()
	{
		driver.findElement(contBtn).click();	
		System.out.println("inventory page open, contine shopping");
	}
	
	public String checkout()
	{
		driver.findElement(chekBtn).click();	
		return driver.getCurrentUrl();
	}
}
