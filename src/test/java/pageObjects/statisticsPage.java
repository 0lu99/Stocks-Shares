package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class statisticsPage {

	public WebDriver driver;

	@FindBy (xpath = "//span[contains(text(),'Statistics')]")
	@CacheLookup
	WebElement statisticsTab;

	@FindBy (xpath = "//h1[1]")
	@CacheLookup
	WebElement companyName;

	@FindBy (xpath = "//div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	@CacheLookup
	WebElement marketCap;

	@FindBy (xpath = "//div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
	@CacheLookup
	WebElement enterpriseValue;

	@FindBy (xpath = "//div[5]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")
	@CacheLookup
	WebElement totalDebt;

	@FindBy (xpath = "//div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	@CacheLookup
	WebElement totalCash;

	@FindBy (xpath = "//div[3]/div[1]/div[1]/span[1]")
	@CacheLookup
	WebElement currentPrice;

	@FindBy (xpath = "//div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[2]")
	@CacheLookup
	WebElement movingAverage200;

	@FindBy (xpath = "//div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
	@CacheLookup
	WebElement dividendYield;

	@FindBy (xpath = "//div[3]/div[1]/table[1]/tbody[1]/tr[5]/td[2]")
	@CacheLookup
	WebElement averageYield5;


	public statisticsPage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1,this);
	}

	public void statisticsTab() {
		statisticsTab.click();
	}

	public void getEnterpriseValue() {


		System.out.println(companyName.getText()
				+"\n"
				+"\nTrading Information"
				+"\nStock price        " + currentPrice.getText()
				+"\n200 day average    " + movingAverage200.getText()
				+"\nDividend yield     " + dividendYield.getText()
				+"\n5 year avg. yield  " + averageYield5.getText()
				+"\n"
				+"\nValuation Measures"
				+"\nMarket Cap is      " + marketCap.getText()
				+"\nEnterprise is      " + enterpriseValue.getText()
				+"\n"
				+"\nBalance Sheet"
				+"\nTotal cash is      " + totalCash.getText()
				+"\nTotal debt is      " + totalDebt.getText());

	}

}