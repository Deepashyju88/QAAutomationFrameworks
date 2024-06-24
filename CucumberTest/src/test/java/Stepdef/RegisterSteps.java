package Stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterSteps {
	
	public WebDriver driver;
	
	@Given("Open the opencart application")
	public void open_the_opencart_application() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	   
	}

	@When("I eneter the valid data in required fields")
	public void i_eneter_the_valid_data_in_required_fields(DataTable table) {
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	   List<List<String>> ls = table.cells();
	   driver.findElement(By.id("input-firstname")).sendKeys(ls.get(1).get(0));
	   driver.findElement(By.id("input-lastname")).sendKeys(ls.get(0).get(1));
	   
	  // System.out.println(ls.get(1).get(0));
	  
	   
	   driver.findElement(By.id("input-email")).sendKeys(ls.get(1).get(2));

	   driver.findElement(By.id("input-telephone")).sendKeys(ls.get(1).get(3));
	   driver.findElement(By.id("input-password")).sendKeys(ls.get(1).get(4));
	   driver.findElement(By.id("input-confirm")).sendKeys(ls.get(1).get(5));
	}
	   
	@When("I check yes radio button")
	public void i_check_yes_radio_button() {
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	    
	}

	@When("I check privacy policy")
	public void i_check_privacy_policy() {
		driver.findElement(By.name("agree")).click();
		
	   
	}

	@When("I click on continue button")
	public void i_click_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	   
	}

	@Then("I should able to register opencart")
	public void i_should_able_to_register_opencart() {
		String url = driver.getCurrentUrl();

		Assert.assertTrue(url.contains("success"), "Fail : title mismatch");
		System.out.println("The url matched sucessfully");
	    
	}


}
