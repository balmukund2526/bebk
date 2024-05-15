package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseTest.BaseClass;

public class Login extends BaseClass {

		
		
		
		@FindBy (xpath ="//button[@id='wzrk-cancel']")
		WebElement popcancelbtn;
		
		@FindBy (xpath ="//a[@class='loginLink']")
		WebElement loginbutton;
		
		@FindBy (xpath ="//button[@id='web_email_login']")
		WebElement loginbyemail;
		
	   @FindBy (xpath ="//input[@id='email_input']")
		WebElement emailenter;

	   @FindBy (xpath ="//input[@id='mob_password']")
	  	WebElement pasword;
	   
	   @FindBy (id ="mob_login_password_submit")
	 	WebElement submitbtn;
	   
	   @FindBy (xpath = "//button[@id='wzrk-cancel']")
	   
	   WebElement cancelpoptwo;
	   
	   @FindBy (xpath ="//i[contains(@class,'icon_user')]")
	   
	   WebElement accounticon;
	   
	   @FindBy (xpath ="//header[contains(@class,'')]//li[1]")
	   WebElement usernametext;

	   public Login(WebDriver driver) {
			this.driver = driver;
			System.out.println(driver);
			PageFactory.initElements(driver, this);   
		}
	   
	 
	   public void popupclickbtn() {
		   
		   popcancelbtn.click();
	   }
	   
	   
	  public void loginbuttonclick() {
		   
		  loginbutton.click();
	   }
	   
	   public void loginbyemail() {
		   loginbyemail.click();
		   
	   }
	   
	   
		
		
//		By popcancelbtn = By.xpath("//button[@id='wzrk-cancel']");
//		By loginbutton = By.xpath();
		//By loginbyemail = By.xpath();

		//By emailenter = By.xpath("");
		//By pasword = By.xpath("//input[@id='mob_password']");

//		By submitbtn = By.id("mob_login_password_submit");
		//By cancelpoptwo = By.xpath("");

		//By accounticon = By.xpath("//i[contains(@class,'icon_user')]");
		//By usernametext = By.xpath("//header[contains(@class,'')]//li[1]");
		
		
		
		

//		public void login() {
//			driver.findElement(popcancelbtn).click();
//			driver.findElement(loginbutton).click();
	//
//			driver.findElement(loginbyemail).click();
	//
//			driver.findElement(emailenter).sendKeys("balmukundsahu2706@gmail.com");
//			driver.findElement(pasword).sendKeys("Apple@123#");
//			driver.findElement(submitbtn).click();
//			driver.findElement(cancelpoptwo).click();
//			driver.findElement(accounticon).click();
//			String username = driver.findElement(usernametext).getText();
//			Assert.assertEquals(username, "Hi, balmukund");
	//
//		}

}
