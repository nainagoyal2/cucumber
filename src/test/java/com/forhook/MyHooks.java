package com.forhook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	public static WebDriver driver;

	@Before
	public void l_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
}

	@After
	public void closeBrowser(Scenario sc) {
		driver.close();

	}


}
