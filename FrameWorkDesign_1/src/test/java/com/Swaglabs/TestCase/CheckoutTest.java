package com.Swaglabs.TestCase;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseClass
{
  @Test(priority=1)
  public void verifyCancell() 
  {
	chp.cancel();
	
	System.out.println("Cancelled the page");
	cp.checkout();
	addWait();
  }
  
  @Test(priority=2)
  public void verifyContinue() 
  {
	 chp.doContinue("Mekhna","Madhur","564789");
	 System.out.println("*********view new page*************");
  }
}
