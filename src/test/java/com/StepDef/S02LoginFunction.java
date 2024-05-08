package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02LoginFunction {
	WebDriver driver;
	String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
	
	@Given("open OHRM in Browser")
	public void open_ohrm_in_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	}

	@Then("Enter the valid email {string} and password {string}")
	public void enter_the_valid_email_and_password(String un, String pwd) {
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd); 
	}
	


	@Then("click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("oxd-button")).click();
		actUrl = driver.getCurrentUrl();
		
	}

	@Then("Dashboard page should be open")
	public void dashboard_page_should_be_open() {
		if(expUrl.equals(actUrl))
			System.out.println("open dasboard page");
		else
			System.out.println("not open dashboard page");
		
driver.close();
	}



@Then("Enter the invalid username {string} and password {string}")
public void enter_the_invalid_username_and_password(String un, String pwd) {
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
  
}
	



	@Then("click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("oxd-button")).click();

	}

	@Then("Error message should be display")
	public void error_message_should_be_display() {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
driver.close();
	}

}






