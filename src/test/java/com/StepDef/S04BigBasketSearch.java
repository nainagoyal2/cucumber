package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.forhook.MyHooks;

import io.cucumber.java.en.*;

public class S04BigBasketSearch {

	MyHooks h1 = new MyHooks();
	@Given("open {string}")
	public void open(String url) {

		h1.driver.get(url);

	}

	@When("I Search the {string}")
	public void i_search_the(String product) {

		h1.driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input"))
				.sendKeys(product);
	}

	@When("I hit Enter")
	public void i_hit_enter() {


		h1.driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input"))
				.sendKeys(Keys.ENTER);
	}

	@Then("Search for Mango should display")
	public void search_for_mango_should_display() {
		System.out.println(
				MyHooks.driver.getTitle());
		// Assert.assertTrue(driver.getCurrentUrl().contains("Mango"));
	}

	@When("I Search for {string}")
	public void i_search_for(String product) {


		h1.driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input"))
				.sendKeys(product);
	}

	@When("hit Enter")
	public void hit_enter() {

		h1.driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[1]/div[1]/div/div/div/div/input"))
				.sendKeys(Keys.ENTER);

	}

	@Then("Search for apple should be display")
	public void search_for_apple_should_be_display() {
		System.out.println(
				h1.driver.getCurrentUrl());
		// Assert.assertTrue(driver.getCurrentUrl().contains("Apple"));
	}

}
