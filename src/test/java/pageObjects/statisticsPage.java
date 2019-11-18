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
	
	@FindBy (xpath = "//div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	@CacheLookup
	WebElement enterpriseValue;
	
	public statisticsPage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1,this);
	}
	
	public void statisticsTab() {
		statisticsTab.click();
	}
	
	public void getEnterpriseValue() {
		System.out.println(enterpriseValue.getText());
		
	}
	
	

}
