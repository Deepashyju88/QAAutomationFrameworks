package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) //Base class driver
	{
		this.driver = driver;
	}
	//locator
	
	private By plist = By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By pNamelist = By.xpath("//div[@class='inventory_item_name ']");
	private By AddButn = By.xpath("//button[text()='Add to cart']");
	//private By removeButn = By.xpath("//button[text()='Remove']");
	
	//method
	
	public int countProduct()
	{
		int count = driver.findElements(plist).size();
		return count;
	}
	
	public void getProductName()
	{
		List<WebElement> list = driver.findElements(pNamelist);
		System.out.println("*********Product name**************");
		
		for (WebElement i : list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addtoCart(String proName)
	{
		List<WebElement> namelist = driver.findElements(pNamelist);
		for (WebElement i :namelist)
		{
			if(i.getText().contains(proName))
			{
				i.click();
				break;
			}
		}
		System.out.println("clicked the productname");
		driver.findElement(AddButn).click();
		
		
	
	}
	
}
