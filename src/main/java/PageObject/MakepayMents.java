package PageObject;

import org.openqa.selenium.By;

import baseTest.BaseClass;

public class MakepayMents extends BaseClass {

	public void makepayment() {

		driver.findElement(By.xpath("//span[@class='cartCount']")).click();
		driver.findElement(By.xpath("//button[@id='os_payNow_btn']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Cash On Delivery']")).click();
		// driver.findElement(By.xpath("//button[@type='button']")).click();

	}
}
