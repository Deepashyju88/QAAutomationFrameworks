package HooksDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	
	public static WebDriver driver;
	
	static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public static WebDriver getdriver()
	{
		return tdriver.get();
	}
	
	public static WebDriver setDriver()
	{
		driver = new ChromeDriver();
		tdriver.set(driver);
		return driver;
	}

}

