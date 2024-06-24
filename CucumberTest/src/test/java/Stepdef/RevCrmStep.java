package Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import HooksRev.BrowserSetupRev;
import io.cucumber.java.en.*;

public class RevCrmStep {

	public WebDriver driver = BrowserSetupRev.getDriver();
	@Given("open the CRM application")
	public void open_the_crm_application() {

//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.automationplayground.com/crm/");
	}

	@When("click on the sign in link")
	public void click_on_the_sign_in_link() {
	    driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("the link should open and redirect to login page")
	public void the_link_should_open_and_redirect_to_login_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Fail : login failed");
		System.out.println("Login sucessfull");
	}

	@When("i enter valied email {string} and valid pswd {string}")
	public void i_enter_valied_email_and_valid_pswd(String email, String pswd) {
		driver.findElement(By.name("email-name")).sendKeys(email);
		driver.findElement(By.name("password-name")).sendKeys(pswd);
			  
	}

	@When("i click on the submit button")
	public void i_click_on_the_submit_button() {
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("I should able to login and navigate to customer page")
	public void i_should_able_to_login_and_navigate_to_customer_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("customers"), "Fail : login failed");
		System.out.println("Login sucessfully completed");
	}



}
