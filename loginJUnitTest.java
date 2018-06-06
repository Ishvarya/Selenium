import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginJUnitTest {
	public static boolean checkInternetConnection() {
		return true;
	}
	@BeforeClass
	public static void start() {
		System.out.println("-------------------------------------------------");
		System.out.println("Beginning of test case 1 execution...............");
		Assume.assumeTrue(checkInternetConnection());
		
	}
	@Before
	public void testNavigation() {
		System.out.println("Open the browser to test");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ishvarya\\Selenium\\SeleniumDrivers\\geckodriver-v0.20.1-win64\\geckodriver.exe");	
	}
	
	@Test
	public void testLogin() {
		System.out.println("Inside Login Block");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("http://mail.yahoo.com");
		WebElement usernameText = firefoxDriver.findElement(By.xpath("//*[@id=\"login-username\"]"));
		usernameText.sendKeys("sample@yahoo.com");
		WebElement nextButton = firefoxDriver.findElement(By.xpath("//*[@id=\"login-signin\"]"));
		nextButton.click();
		WebElement errorDisplay = firefoxDriver.findElement(By.id("username-error"));
		System.out.println("Error message: "+ errorDisplay.getText());
		firefoxDriver.close();
	}
	@Test
	public void testTroubleShoot() {
		System.out.println("Inside Trouble Shooting Block");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("http://mail.yahoo.com");
		WebElement troubleShoot = firefoxDriver.findElement(By.xpath("//*[@id=\"mbr-forgot-link\"]"));
		troubleShoot.click();
		WebElement usernameText = firefoxDriver.findElement(By.xpath("//*[@id=\"username\"]"));
		usernameText.sendKeys("sample@yahoo.com");
		WebElement continueButton = firefoxDriver.findElement(By.name("verifyYid"));
		continueButton.click();
		firefoxDriver.close();
	}
	@After
	public void testClose() {
		System.out.println("Browser is closed after testing");
	}
	@AfterClass
	public static void end() {
		System.out.println("End of test case 1 execution....................");
		System.out.println("-------------------------------------------------");
	}

}
