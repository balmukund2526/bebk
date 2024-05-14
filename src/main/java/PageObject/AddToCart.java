package PageObject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseTest.BaseClass;

public class AddToCart extends BaseClass {

	By addtobagbutton = By.xpath("//span[normalize-space()='ADD TO BAG']");

	By bagicon = By.xpath("//i[@class='icon_bag']");

	By productprice = By.xpath("//span[@class='cartProductPrice']");

	By Continue = By.xpath("//button[@id='os_payNow_btn']");

	By cashondelivery = By.xpath("//span[normalize-space()='Cash On Delivery']");
	By finalamtpaybtn = By.xpath("//button[@type='button']");

	By totalamt = By.xpath("//div[@class='f-b2-s mt-3 d-flex justify-content-between']");

	public void addToCart() throws InterruptedException {
		driver.findElement(addtobagbutton).click();
		Thread.sleep(2000);
		driver.findElement(bagicon).click();
	}

	public void paynow() {
		driver.findElement(Continue).click();

		driver.findElement(cashondelivery).click();

		driver.findElement(finalamtpaybtn).click();

	}

	public void itemprice() {
		String price = driver.findElement(productprice).getText();

		System.out.println(price);
	}

	public String Totalamt() {

		String finalamt = driver.findElement(totalamt).getText();

		System.out.println("total order amount " + finalamt);
		return finalamt;

	}

}
