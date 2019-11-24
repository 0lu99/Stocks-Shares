package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//button[@name='agree']")
	@CacheLookup
	WebElement agreeButton;
	
	@FindBy (xpath = "//input[@id='yfin-usr-qry']")
	@CacheLookup
	WebElement searchBar;
	
	@FindBy (xpath = "//button[@id='search-button']")
	@CacheLookup
	WebElement searchButton;
	
	
	public homePage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1,this);
		
	}
	
	public void clickOK() {
		agreeButton.click();
	}
	
	public void typeStock(String stockName) throws IOException {
		searchBar.clear();
		searchBar.sendKeys(stockName);
		
	}
	
	public void clickSearch() {
		searchButton.click();
	}
	

}
