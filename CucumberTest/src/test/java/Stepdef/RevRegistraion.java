package Stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RevRegistraion {
	
	public WebDriver driver;
	
	@Given("open the registraion page of opencart application")
	public void open_the_registraion_page_of_opencart_application() {
	  driver =new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}


	@When("enter the fields of the reg form")
	public void enter_the_fields_of_the_reg_form(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		//String td = table.cell(1, 0);
		List<List<String>>td = table.cells();
		driver.findElement(By.id("input-firstname")).sendKeys(td.get(1).get(0));
		driver.findElement(By.name("lastname")).sendKeys(td.get(1).get(1));
		driver.findElement(By.id("input-email")).sendKeys(td.get(1).get(2));
		driver.findElement(By.name("telephone")).sendKeys(td.get(1).get(3));
		driver.findElement(By.name("password")).sendKeys(td.get(1).get(4));
		driver.findElement(By.name("confirm")).sendKeys(td.get(1).get(5));
	}

	@When("I check the radio button for yes")
	public void i_check_the_radio_button_for_yes() {
	    driver.findElement(By.name("newsletter")).click();
	}

	@When("I check the private policy")
	public void i_check_the_private_policy() {
	    driver.findElement(By.name("agree")).click();

	}
	
	@When("I click on continue")
	public void i_click_on_continue() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("I should able to do registraion process")
	public void i_should_able_to_do_registraion_process() {
		Assert.assertTrue(driver.getCurrentUrl().contains("success"),"Fail : url not matched");
		System.out.println("URL matched ");
	}



}
