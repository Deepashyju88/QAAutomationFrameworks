package Stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLoginStep {
	
	public WebDriver driver;
	@Given("open cart login page")
	public void open_cart_login_page() {
		
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("I enter valid login credentials")
	public void i_enter_valid_login_credentials(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<Map<String,String>> td = table.asMaps();
		System.out.println("table test");
		driver.findElement(By.id("input-email")).sendKeys(td.get(0).get("email"));
		driver.findElement(By.id("input-password")).sendKeys(td.get(0).get("password"));
		
	
	}

	@When("I click on Login button from cart page")
	public void i_click_on_login_button_from_cart_page() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("I should able to login into the opencart application")
	public void i_should_able_to_login_into_the_opencart_application() {
	   String title = driver.getTitle();
	   Assert.assertTrue(title.contains("Account"),"Fail : the title mismatched");
	   System.out.println("Title matched ");
	}
}
