package Stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
		
		

public class RevGoogle {

	public WebDriver driver;
	String title;
	
	@Given("Open the google application")
	public void open_the_google_application() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("capture the google current page title")
	public String capture_the_google_current_page_title() {
		 title = driver.getTitle();
	    System.out.println(title);
	    return title;
	    
	}

	@Then("crosscheck the title with expected title")
	public void crosscheck_the_title_with_expected_title() {
	    Assert.assertTrue(title.contains("Google"), "Fail : title not matched");
	    System.out.println("Title matched");
	}
	
	@When("i enter the valid search key word and")
	public void i_enter_the_valid_search_key_word_and() {
	    driver.findElement(By.id("APjFqb")).sendKeys("JavaScript");
	    System.out.println("Text entered in the search field");
	}

	@Then("google application should provide valid search results")
	public void google_application_should_provide_valid_search_results() {

		List<WebElement> ele = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement i : ele)
		{
			System.out.println(i.getText());
		}
	}
}