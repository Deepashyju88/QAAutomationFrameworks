package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverViewPage 
{
	private WebDriver driver;
	
	public OverViewPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locator
	private By summary = By.xpath("//div[@class='summary_info']//div[contains(@class,'summary')]");
	private By finishBtn = By.name("finish");
	private By meg = By.tagName("h2");
	
	public void summaryCheck()
	{
		List<WebElement> list = driver.findElements(summary);
		//System.out.println(list);
		for(WebElement i : list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void doFinish()
	{
		driver.findElement(finishBtn).click();
		String fmeg= driver.findElement(meg).getText();
		System.out.println("Final page message : "+ fmeg);
	}

}
