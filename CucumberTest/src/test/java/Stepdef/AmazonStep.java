package Stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonStep {
	public WebDriver driver;

@Given("open Amazon application")
public void open_amazon_application() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in");
}

@When("user capture the actual title of amazone application")
public void user_capture_the_actual_title_of_amazone_application() {
    System.out.println("Title of home page is : "+ driver.getTitle());
}

@Then("The title should match with the expected title")
public void the_title_should_match_with_the_expected_title() {
    Assert.assertTrue(driver.getTitle().contains("Shopping"),"Fail : the homepage title mismatch");
    System.out.println("Home page title matched");
}

@When("user open best seller page")
public void user_open_best_seller_page() {
   driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
   System.out.println("user opened bestseller page");
}

@When("user capture best seller page actual title")
public void user_capture_best_seller_page_actual_title() {
    System.out.println("best seller title is : "+driver.getTitle());
}

@Then("The title should match with the best seller expected title")
public void the_title_should_match_with_the_best_seller_expected_title() {
     Assert.assertTrue(driver.getTitle().contains("Bestsellers"), "Fail : bestseller title mismatch");
     System.out.println("Best seller title matched");
}

@When("user open mobiles page")
public void user_open_mobiles_page() {
    driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
    System.out.println("user opened mobiles page");

}

@When("user capture mobiles page actual title")
public void user_capture_mobiles_page_actual_title() {
   System.out.println(driver.getTitle());
}

@Then("The title should match with the mobiles expected title")
public void the_title_should_match_with_the_mobiles_expected_title() {
	 Assert.assertTrue(driver.getTitle().contains("Mobile"),"Fail : the mobiles title mismatched");
	    System.out.println("Mobile title matched");
}
@When("user open sell page")
public void user_open_sell_page() {
    driver.findElement(By.xpath("//a[text()='Sell']")).click();
    System.out.println("user opened sell page");

}

@When("user capture sell page actual title")
public void user_capture_sell_page_actual_title() {
	   System.out.println(driver.getTitle());

}

@Then("The title should match with the sell expected title")
public void the_title_should_match_with_the_sell_expected_title() {
	 Assert.assertTrue(driver.getTitle().contains("CrossShop"),"Fail : the sell title mismatched");
	    System.out.println("sell title matched");
}

}
