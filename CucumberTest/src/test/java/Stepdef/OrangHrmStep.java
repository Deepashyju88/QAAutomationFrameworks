package Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.*;

public class OrangHrmStep {
	
	WebDriver driver;

	@Given("open OrangeHrm application")
	public void open_orange_hrm_application() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		    
	}

	@When("user enter the user name {string} and password {string} in the login fields")
	public void user_enter_the_user_name_and_password_in_the_login_fields(String un, String pswd) {
	
		driver.findElement(By.name("username")).sendKeys(un);

		Reporter.log("Log : The key word entered ", true);
		driver.findElement(By.name("password")).sendKeys(pswd);

		Reporter.log("Log : Password entered " , true);
		
	}

	@When("user click on the Login button from login pannel")
	public void user_click_on_the_login_button_from_login_pannel() {
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		System.out.println("Login button clicked");
	}

	@Then("user able to login and enter into dashboard page")
	public void user_able_to_login_and_enter_into_dashboard_page() {
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Fail : The login failed");
		System.out.println("Login sucessfull!");
	}

}
