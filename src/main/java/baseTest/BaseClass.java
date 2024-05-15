package baseTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extent = new ExtentReports();
	public static ExtentSparkReporter spark = new ExtentSparkReporter("spark.html");

	@BeforeTest
	public void base() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("bebkoof.com");
		extent.attachReporter(spark);

	//	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bewakoof.com/");
		
		// why it is not working with thewebdrivermananger

	}

	@AfterTest 
	public void teardown() {

		extent.flush();
		driver.quit();

	}

}
