package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseClass;

public class HomePage extends BaseClass {

	By searchbox = By.xpath("//input[@placeholder='Search by product, category or collection']");

	By listofsearch = By.xpath("//div[contains(@class,'resultList')]//div[2]//a[1]");
	

	By coverwarper = By.xpath(
			"//div[@class='hidden-xs mainComponentContainer']//div[@class='mobCoverWrapper']//div[1]//a[1]//div[1]");

	By covers = By.xpath("//div[@id='testProductcard_1']//h3[contains(@class,'undefined')][normalize-space()='Qrioh']");

	By mobilebarnd = By.xpath("//div[@class='section']//div[@class='brandName'][normalize-space()='Xiaomi']");


	
	public void searchproduct() {
		//ExtentTest test = extent.createTest("searching the mobile covers");
		driver.findElement(searchbox).sendKeys("MOBILE COVERS");

		driver.findElement(listofsearch).click();

		String pagetitle = driver.findElement(By.xpath("//h1[@class='pageTitle']")).getText();
		Assert.assertEquals(pagetitle, "Mobile Covers And Cases");

	}
	
	
	public void gotoitem() {

		driver.findElement(mobilebarnd).click();

		driver.findElement(coverwarper).click();

		driver.findElement(covers).click();

	}

}
