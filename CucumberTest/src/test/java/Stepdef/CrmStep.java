package Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import HooksDemo.BrowserSetup;
import io.cucumber.java.en.*;

public class CrmStep {
	
	public WebDriver driver = BrowserSetup.getdriver();
	
	@Given("Open the home page of Crm application")
	public void open_the_home_page_of_crm_application() {
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.get("https://www.automationplayground.com/crm/");
	}

	@When("user click on signin link")
	public void user_click_on_signin_link() {

		driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("the signin page should open")
	public void the_signin_page_should_open() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Fail : url not match");
	    System.out.println("signin sucessfully");
	}

	@When("user enter valid user id {string} and password {string}")
	public void user_enter_valid_user_id_and_password(String email, String pass) {
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.name("submit-name")).click();
	}

	@Then("user should able to login and navigate to customer page")
	public void user_should_able_to_login_and_navigate_to_customer_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("customers"), "fail : the login failed");
	    System.out.println("login sucessfully");
	}

}
