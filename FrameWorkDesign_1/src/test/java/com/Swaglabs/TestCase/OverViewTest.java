package com.Swaglabs.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverViewTest extends BaseClass
{
  @Test(priority= 1)
  public void verifySummary() {
	  op.summaryCheck();
  }
  
  @Test(priority= 2)
  public void finish() {
	  op.doFinish();
  }
}
