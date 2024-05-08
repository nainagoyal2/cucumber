package com.StepDef;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

import io.cucumber.java.en.*;


public class S01GoogleTitle {
	WebDriver driver;
	String expTitle;
	@Given("open google")
	public void open_google() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

	@When("Read title")
	public void read_title() {
		expTitle = driver.getTitle();
	
	   
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		if(expTitle.equals("Google"))
		{
			System.out.println("Title matching");
		}
		else
		{
			System.out.println("Title not matching");
		}
	}
		
		@Given("open the google")
		public void open_the_google() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
		    
		}

		@When("Enter valid data in search box")
		public void enter_valid_data_in_search_box() {
			driver.findElement(By.id("APjFqb")).sendKeys("domlur");
		   
		}

		@When("Hit enter")
		public void hit_enter() {
			driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		}

		@Then("Search should be shown")
		public void search_should_be_shown() {
			if(driver.getTitle().contains("domlur"))
				{
					System.out.println("Search is matching");
				}
				else
				{
					System.out.println("Search is not matching");
				}
		   
		}


		


}
