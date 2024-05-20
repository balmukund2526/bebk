package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import ActionClass.methodsf;
import baseTest.BaseClass;

public class HomePage extends BaseClass {
	methodsf mf = new methodsf();
	@FindBy(xpath = "//input[@placeholder='Search by product, category or collection']")
	WebElement searchbox;

	@FindBy(xpath = "//div[contains(@class,'resultList')]//div[2]//a[1]")
	WebElement listofsearch;

	@FindBy(xpath = "//div[@class='hidden-xs mainComponentContainer']//div[@class='mobCoverWrapper']//div[1]//a[1]//div[1]")
	WebElement coverwarper;

	@FindBy(xpath = "//div[@id='testProductcard_1']//h3[contains(@class,'undefined')][normalize-space()='Qrioh']")
	WebElement covers;

	@FindBy(xpath = "//div[@class='section']//div[@class='brandName'][normalize-space()='Xiaomi']")
	WebElement mobrandname;

	@FindBy(xpath = "//h1[@class='pageTitle']")
	WebElement pageTitle;
   
	@FindBy(xpath="//input[@class='searchInput form-controls']")
	WebElement entertextinsearch;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver= driver;		
		PageFactory.initElements(driver, this);
	}
	
	
	

	
	public void searchproduct() {
		// ExtentTest test = extent.createTest("searching the mobile covers");
		searchbox.click();
		//mf.click(driver,searchbox);
		entertextinsearch.sendKeys("mobile");
	//	mf.click(driver, listofsearch);
		//listofsearch.click();

		//String pagetitle = pageTitle.getText();
		//Assert.assertEquals(pagetitle, "Mobile Covers And Cases");

	}

	public void gotoitem() {

		mobrandname.click();
		coverwarper.click();
		covers.click();

	}

}
