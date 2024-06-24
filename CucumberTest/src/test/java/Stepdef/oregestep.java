package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class oregestep {
	public WebDriver driver;
	
	
	@Given("the orange hrm site opend")
	public void the_orange_hrm_site_opend() {
		driver= new ChromeDriver();
		driver.get("dsvdfshf");
	}

	@When("I enter the userid Admin and password admin123")
	public void i_enter_the_userid_admin_and_password_admin123(String uid, String pwd) {
	   driver.findElement(By.id("jahjds")).sendKeys(uid);
	}

	@When("I click onthe login button")
	public void i_click_onthe_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the page should login and enter into the application")
	public void the_page_should_login_and_enter_into_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the userid sam and password Test123")
	public void i_enter_the_userid_sam_and_password_test123() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter the userid tkhk and password tres123")
	public void i_enter_the_userid_tkhk_and_password_tres123() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
