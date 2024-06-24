package Stepdef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class RevAmazonStep {
	
	public WebDriver driver;
	String title;
	
	@Given("Open Amazon application")
	public void open_amazon_application() {
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.com");
	    
	}

	@When("user capture the current title of the page")
	public String user_capture_the_current_title_of_the_page() {
		title = driver.getTitle();
		return title;
	}

	@Then("The title should match with the expected title of the home page")
	public void the_title_should_match_with_the_expected_title_of_the_home_page() {
		Assert.assertTrue(title.contains("shopping"));
		System.out.println("The title is of homepage");
			
	}

	@When("user open the bestseller link")
	public void user_open_the_bestseller_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The title should match with the expected title of the best seller page")
	public void the_title_should_match_with_the_expected_title_of_the_best_seller_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user open the books link")
	public void user_open_the_books_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The title should match with the expected title of the books page")
	public void the_title_should_match_with_the_expected_title_of_the_books_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user open the giftcards link")
	public void user_open_the_giftcards_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The title should match with the expected title of the gift cards page")
	public void the_title_should_match_with_the_expected_title_of_the_gift_cards_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
