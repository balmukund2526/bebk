package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseClass;

public class Login extends BaseClass {
	By popcancelbtn = By.xpath("//button[@id='wzrk-cancel']");
	By loginbutton = By.xpath("//a[@class='loginLink']");
	By loginbyemail = By.xpath("//button[@id='web_email_login']");

	By emailenter = By.xpath("//input[@id='email_input']");
	By pasword = By.xpath("//input[@id='mob_password']");

	By submitbtn = By.id("mob_login_password_submit");
	By cancelpoptwo = By.xpath("//button[@id='wzrk-cancel']");

	By accounticon = By.xpath("//i[contains(@class,'icon_user')]");
	By usernametext = By.xpath("//header[contains(@class,'')]//li[1]");

	public void login() {
		driver.findElement(popcancelbtn).click();
		driver.findElement(loginbutton).click();

		driver.findElement(loginbyemail).click();

		driver.findElement(emailenter).sendKeys("balmukundsahu2706@gmail.com");
		driver.findElement(pasword).sendKeys("Apple@123#");
		driver.findElement(submitbtn).click();
		driver.findElement(cancelpoptwo).click();
		driver.findElement(accounticon).click();
		String username = driver.findElement(usernametext).getText();
		Assert.assertEquals(username, "Hi, balmukund");

	}

}
