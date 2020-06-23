package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class statisticsPage {

	public WebDriver driver;

	@FindBy (xpath = "//span[contains(text(),'Statistics')]")
	@CacheLookup
	WebElement statisticsTab;
	
	/*
	 * Stock Name
	 */

	@FindBy (css = ".Fz\\(18px\\)")
	@CacheLookup
	WebElement companyName;
	
	/*
	 * Valuation measures
	 */

	@FindBy (css = ".fi-row:nth-child(1) > .Fw\\(500\\)")
	@CacheLookup
	WebElement marketCap;
	
	@FindBy (css = ".fi-row:nth-child(2) > .Fw\\(500\\)")
	@CacheLookup
	WebElement enterpriseValue;
	
	@FindBy (css = ".fi-row:nth-child(2) > .Fw\\(500\\)")
	@CacheLookup
	WebElement forwardPE;
	
	/*
	 * Income Statement
	 */

	@FindBy (css = ".Mb\\(10px\\) > .Pos\\(r\\):nth-child(2) .Bxz\\(bb\\):nth-child(1) > .Fw\\(500\\)")
	@CacheLookup
	WebElement profitMargin;
	
	@FindBy (css = ".Pos\\(r\\):nth-child(4) .Bxz\\(bb\\):nth-child(7) > .Fw\\(500\\)")
	@CacheLookup
	WebElement eps;
	
	
	/*
	 * Dividends & Splits
	 */
	
	@FindBy (css = ".Pstart\\(20px\\) > .Pos\\(r\\):nth-child(3) .Bxz\\(bb\\):nth-child(2) > .Fw\\(500\\)")
	@CacheLookup
	WebElement dividendYield;
	
	@FindBy (css = ".Pos\\(r\\):nth-child(3) > div > div > .W\\(100\\%\\) .Bxz\\(bb\\):nth-child(6) > .Fw\\(500\\)")
	@CacheLookup
	WebElement payoutRatio;
	
	@FindBy (css = ".Pos\\(r\\):nth-child(3) > div > div > .W\\(100\\%\\) .Bxz\\(bb\\):nth-child(5) > .Fw\\(500\\)")
	@CacheLookup
	WebElement averageYield5;
	

	/*
	 * Balance Sheet
	 */
	@FindBy (css = ".Pos\\(r\\):nth-child(5) .Bxz\\(bb\\):nth-child(3) > .Fw\\(500\\)")
	@CacheLookup
	WebElement totalDebt;

	@FindBy (css = ".Pos\\(r\\):nth-child(5) .Bxz\\(bb\\):nth-child(1) > .Fw\\(500\\)")
	@CacheLookup
	WebElement totalCash;
	
	@FindBy (css = ".Pos\\(r\\):nth-child(6) .Bxz\\(bb\\):nth-child(1) > .Fw\\(500\\)")
	@CacheLookup
	WebElement operatingCashFlow;

	

	public statisticsPage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1,this);
	}

	public void statisticsTab() {
		statisticsTab.click();
	}

	public void getEnterpriseValue() {


		System.out.println(
				companyName.getText()
				+"\n"
				+"\nTrading Information:"
				+"\nForward P/E        " + forwardPE.getText()
				+"\nDividend yield     " + dividendYield.getText()
				+"\n5 year avg. yield  " + averageYield5.getText()
				+"\nPayout ratio       " + payoutRatio.getText()
				+"\n"
				+"\nValuation Measures:"
				+"\nMarket Cap is      " + marketCap.getText()
				+"\nEnterprise is      " + enterpriseValue.getText()
				+"\n"
				+"\nIncome Statement:"
				+"\nProfit Margin      " + profitMargin.getText()
				+"\nDiluted EPS        " + eps.getText()
				+"\n"
				+"\nBalance Sheet:"
				+"\nTotal cash is      " + totalCash.getText()
				+"\nTotal debt is      " + totalDebt.getText()
				+"\nOp. cash flow      " + operatingCashFlow.getText()
				);

	}

}