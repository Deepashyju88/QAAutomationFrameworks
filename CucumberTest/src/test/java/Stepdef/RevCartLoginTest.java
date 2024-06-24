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

public class RevCartLoginTest {
	
	public WebDriver driver;
	
	@Given("i open the cartpage application")
	public void i_open_the_cartpage_application() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("Enter the valid credential in email address and password")
	public void enter_the_valid_credential_in_email_address_and_password(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> td=table.asMaps();
		driver.findElement(By.id("input-email")).sendKeys(td.get(0).get("email"));
		driver.findElement(By.name("password")).sendKeys(td.get(0).get("Pswd"));
	}

	@When("Enter click the login button")
	public void enter_click_the_login_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("I should able to Login in sucessfully")
	public void i_should_able_to_login_in_sucessfully() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("account/account"), "Fail : The login unsucessfull");
	    
	    System.out.println("Login sucessfully");
	}

}
