package Testclas;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.Login;
import baseTest.BaseClass;

public class HomePagetest extends BaseClass {

	HomePage hp;
	Login lp;

	@Test
	public void HomePage() throws InterruptedException {

		lp = new Login(driver);
		hp = new HomePage(driver);

		lp.popupclickbtn();
		lp.popupclickbtn();
		lp.loginbuttonclick();
		lp.loginbyemail();
		lp.enteremail();
		lp.enterpass();
		lp.submitbtnclick();
		Thread.sleep(4000);
		//hp.searchproduct();
		//hp.gotoitem();

	}

}
