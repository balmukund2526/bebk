package ActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseTest.BaseClass;

public class methodsf extends BaseClass {

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