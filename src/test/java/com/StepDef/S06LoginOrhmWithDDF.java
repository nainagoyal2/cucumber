package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S06LoginOrhmWithDDF {
	WebDriver driver;
	String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
	@Given("open the Orange HM application with ddf")
	public void open_the_orange_hm_application_with_ddf() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("i enter {string} and {string}")
	public void i_enter_and(String un, String pwd) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
	
		
	}
	
	@When("Click on submit button for login")
	public void click_on_submit_button_for_login() {
		driver.findElement(By.className("oxd-button")).click();
		actUrl = driver.getCurrentUrl();
		}
	

	@Then("login  succesfully")
	public void login_succesfully() {
		if(expUrl.equals(actUrl))
			System.out.println("open dasboard page");
		else
			System.out.println("not open dashboard page");
		Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
driver.close();

	
	}



}
