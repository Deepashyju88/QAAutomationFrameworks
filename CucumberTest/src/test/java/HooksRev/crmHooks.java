package HooksRev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class crmHooks {

//	WebDriver driver;
//	@Before
//	public void startSession() {
//		System.out.println("Srat the session");
//		//driver = new ChromeDriver();
//		driver = BrowserSetupRev.setDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.automationplayground.com/crm/");
//	}
//	
//	@Before("@Login")
//	public void beforeLogin()
//	{
//	    driver.findElement(By.linkText("Sign In")).click();
//
//	}
//	
//	@After
//	public void teardown()
//	{
//		System.out.println("close the session");
//		driver.quit();
//	}
}
