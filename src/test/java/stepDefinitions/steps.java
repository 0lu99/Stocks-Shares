package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.homePage;
import pageObjects.statisticsPage;

public class steps {
	
	WebDriver driver;
	homePage page1;
	statisticsPage page2;

	@Given("I open Goolge Chrome")
	public void i_open_Goolge_Chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(500);
		
		page1 = new homePage(driver);
		page2 = new statisticsPage(driver);
		
		driver.manage().window().maximize();

	}

	@Given("I go to Yahoo Finance {string}")
	public void i_go_to_Yahoo_Finance(String webUrl) {
		driver.get(webUrl);

	}

	@When("I search for a stock {string}")
	public void i_search_for_a_stock(String stockName) throws InterruptedException, IOException {
		Thread.sleep(1500);
		page1.clickOK();
		Thread.sleep(1500);
		page1.typeStock(stockName);
		Thread.sleep(1500);
		page1.clickSearch();

	}

	@When("I go to the statistics tab")
	public void i_go_to_the_statistics_tab() throws InterruptedException {
		Thread.sleep(3000);
		page2.statisticsTab();
		Thread.sleep(1500);

	}

	@Then("I get the enterprise value")
	public void i_get_the_enterprise_value() throws IOException {
		page2.getEnterpriseValue();
	}
	
	@Then("I close the browser")
	public void i_close_the_browser() throws IOException {
		driver.close();
	}

}
