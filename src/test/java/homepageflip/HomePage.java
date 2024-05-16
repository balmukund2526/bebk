package homepageflip;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObject.AddToCart;
import PageObject.HomePage;
import PageObject.Login;
import baseTest.BaseClass;

public class HomePage extends BaseClass {

	Login lp = new Login();

	HomePage hm = new HomePage();

	AddToCart ac = new AddToCart();

	@Test(priority = 1)
	public void loginbtn() {
		lp.login();

		String pricr = "inseertes";
	}

	 @Test(priority = 2)
	public void searchitem() {

		hm.searchproduct();
	}

	@Test(priority = 3)
	public void addtocarttest() throws InterruptedException {
		hm.gotoitem();

	}

	@Test(priority = 4)
	public void additemtocart() throws InterruptedException {
		ac.addToCart();

	}

	@Test(priority = 5)
	public void cashondelivery() {
		ac.paynow();
		String price = ac.Totalamt();
		System.out.println("total price of item " +price);
		

	}

}