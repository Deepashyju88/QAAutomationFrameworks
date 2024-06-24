package Stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleStep {

	public WebDriver driver;
	public String title;
	
	@Given("Open the google page")
	public void open_the_google_page() {
	    System.out.println("Google application opens");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("I capture the current title")
	public String i_capture_the_current_title() {
	    System.out.println("current page title captured");
	    return title = driver.getTitle();
	}

	@Then("The title should match to Google")
	public void the_title_should_match_to_google() {
	   Assert.assertTrue(title.contains("Gohogle"), "Fail : title not match");
	   System.out.println("title matched");

	}
	
	@When("I enter the valid key word in the search box")
	public void i_enter_the_valid_key_word_in_the_search_box() {
	   driver.findElement(By.id("APjFqb")).sendKeys("cucumber");
	}

	@Then("google application should provide valid search result")
	public void google_application_should_provide_valid_search_result() {

		List<WebElement> list1 = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("The total available search results : "+ list1.size());
		for(WebElement i : list1)
		{
			System.out.println(i.getText());
		}
	} 
}
