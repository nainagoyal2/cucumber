package com.StepDef;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class S03AmazonTest {

WebDriver driver;
@Given("open the Amazon Browser")
public void open_the_amazon_browser() {
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.get("https://www.amazon.in/");
}

@When("I click on sell")
public void i_click_on_sell() {
  driver.findElement(By.linkText("Sell")).click();
  Assert.assertTrue(driver.getTitle().contains("CrossShop1"));
}

@Then("Sell page should be open")
public void sell_page_should_be_open() {
    System.out.println("Sell Title: "+driver.getTitle());
    driver.close();
}

@When("I click on BestSeller")
public void i_click_on_best_seller() {
	  driver.findElement(By.linkText("Best Sellers")).click();
}

@Then("BestSeller page should be open")
public void best_seller_page_should_be_open() {
	System.out.println("BestSeller Title: "+driver.getTitle());
	 Assert.assertTrue(driver.getTitle().contains("most popular"));
	driver.close();
}

@When("I click on Mobile")
public void i_click_on_mobile() {
	  driver.findElement(By.linkText("Mobiles")).click();
}

@Then("Mobile page should be open")
public void mobile_page_should_be_open() {
	System.out.println("Mobile Title: "+driver.getTitle());
	 Assert.assertTrue(driver.getTitle().contains("Buy Cell"));
	driver.close();
    
}

@When("I click on Electronic")
public void i_click_on_electronic() {
	  driver.findElement(By.linkText("Electronics")).click();
   
}

@Then("Electronic page should be open")
public void electronic_page_should_be_open() {
	System.out.println("Electronic Title: "+driver.getTitle());
	 Assert.assertTrue(driver.getTitle().contains("Best Prices"));
	driver.close();
}


}