package com.Swaglabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  String lpUrl = lp.getloginUrl();
	  Assert.assertTrue(lpUrl.contains("demo"),"Fail : Page failed");
	  System.out.println("Url load sucessfully");
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String lpTitle = lp.getTitle();
	  Assert.assertTrue(lpTitle.contains("Swag"),"Fail : Title not matched");
	  System.out.println("Title Matched !");
  }
  
  
  @Test(priority=3)
  public void verifyLogin() 
  {
	  
	  String curUrl = lp.doLogin("standard_user", "secret_sauce");
	  Assert.assertTrue(curUrl.contains("inventory"),"Fail : Login failed");
	  System.out.println("Login sucessfully");
  }
}
