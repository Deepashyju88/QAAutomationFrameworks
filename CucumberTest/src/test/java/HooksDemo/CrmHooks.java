package HooksDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CrmHooks {
	
	WebDriver driver;

//	@Before
//	public void setUp()
//	{
//		System.out.println("Application open with browser");
//		//driver= new ChromeDriver();
//		driver = BrowserSetup.setDriver();
//		driver.get("https://www.automationplayground.com/crm/");
//	}
//	
//	@Before("@Login")
//	public void BeforeLogin()
//	{
//		System.out.println("befor login from hook");
//		driver.findElement(By.linkText("Sign In")).click();
//	}
//	
//	@After
//	public void tearDown()
//	{
//		System.out.println("Browser will close");
//	}
}
