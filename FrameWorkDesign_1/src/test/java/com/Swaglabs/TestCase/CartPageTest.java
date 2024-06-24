package com.Swaglabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyRemove() 
  {
		cp.Removeitem();
		
		addWait();

	  
  }
  
  @Test(priority=2)
  public void verifyContinueShoping() 
  {
	  cp.continueShop();
		addWait();
	  ip.addtoCart("Sauce Labs Fleece Jacket");
		addWait();
	  cp.CartPageOpen();
  }
  
  @Test(priority=3)
  public void verifyCheckout() 
  {
	  String curl = cp.checkout();
		addWait();

	  Assert.assertTrue(curl.contains("checkout"), "Fail : checkout failed");
	  System.out.println("Checkout done sucessfully");
  }
  
  
}
