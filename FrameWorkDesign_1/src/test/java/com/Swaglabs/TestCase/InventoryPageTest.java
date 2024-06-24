package com.Swaglabs.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Swaglabs.Utility.PropertiesReader;

public class InventoryPageTest extends BaseClass
{
	

	
  @Test(priority=1)
  public void verifyProdCount() 
  {
	  int count = ip.countProduct();
	  Assert.assertEquals(count, 6, "Fail : the product count not match");
	  System.out.println("The count found . " + count);
  }
  
  @Test(priority=2)
  public void verifyProdName() 
  {
	  ip.getProductName();
  }
  
  @Test(priority=3)
  public void verifyAddtoCart() 
  {
	 ip.addtoCart(p1.getdata("prod2"));
	  
  }
}
