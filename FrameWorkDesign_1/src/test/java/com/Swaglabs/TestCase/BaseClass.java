package com.Swaglabs.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.Swaglabs.Utility.PropertiesReader;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckoutPage chp;
	public OverViewPage op;
	public PropertiesReader p1;
	
	@BeforeTest //for all the page browser
	public void setUpBrowser()
	{
		p1 = new PropertiesReader();	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getdata("url"));

		
		lp = new LoginPage(driver);
		ip = new InventoryPage(driver);
		cp = new CartPage(driver);
		chp = new CheckoutPage(driver);
		op = new OverViewPage(driver);
		
	}
	
	@BeforeClass
	public void SetUp()
	{
		System.out.println("************Login Page ***************");
		System.out.println("URL iS "+lp.getloginUrl());
		System.out.println("Title is : " + lp.getTitle());
		addWait();
		lp.doLogin(p1.getdata("un"),p1.getdata("pwd"));
		
		System.out.println("************Inventory Page ***************");
		System.out.println("Total prod count " + ip.countProduct());
		ip.getProductName();
		addWait();

		ip.addtoCart("Sauce Labs Onesie");
		addWait();
		cp.CartPageOpen();
		System.out.println("************Cart Page ***************");
		cp.Removeitem();
		addWait();
		cp.continueShop();
		ip.addtoCart("Sauce Labs Bike Light");
		cp.CartPageOpen();
		cp.checkout();
		addWait();
		System.out.println("************checkout Page ***************");
		chp.doContinue(p1.getdata("fname"),p1.getdata("lname"),p1.getdata("zc"));
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
}
