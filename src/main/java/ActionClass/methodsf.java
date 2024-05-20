package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import baseTest.BaseClass;

public class methodsf extends BaseClass {
	
	public void mouseOverElement(WebDriver driver,WebElement element) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(element).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println(" MouserOver Action is performed on ");
			} else {
				System.out.println("MouseOver action is not performed on");
			}
		}
	}
	public boolean moveToElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement(locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}
	

 

	public void typeBySendkeys(String value, WebElement ele) {

		ele.sendKeys(value);

	}
	
	public void clickonelement( WebElement ele) {

		ele.click();

	}
	
	public void Isdiplayed( WebElement ele) {

		ele.isDisplayed();

	}
	
	public void selectbyindex(WebElement ele,String value) {
		
		Select sc= new Select(ele);
		sc.selectByValue(value);
	}
	
	

}