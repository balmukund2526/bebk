package Testclas;

import org.testng.annotations.Test;

import PageObject.Login;
import baseTest.BaseClass;

public class loginTest extends BaseClass {
	
	Login lp;
	@Test
	public void login() throws InterruptedException {
		 lp = new Login(driver);
		Thread.sleep(5000);
		lp.popupclickbtn();
		lp.loginbuttonclick();
		
		
	}
	
		
		
		
	

}
