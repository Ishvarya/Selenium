import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchJUnitTest {
	@BeforeClass
	public static void start() {
		System.out.println("-------------------------------------------------");
		System.out.println("Beginning of test case 2 execution...............");
		
	}
	@Before
	public void openPage() {
		System.out.println("Open the webpage to search");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishvarya\\Selenium\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
	}
	
	@Test
	public void searchText() {
		System.out.println("Inside search Block");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.wikipedia.org/");
		Select select = new Select(chromeDriver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")));
		select.selectByValue("en");
		WebElement searchText = chromeDriver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
		searchText.sendKeys("Charles Babbage");
		WebElement searchButton = chromeDriver.findElement(By.className("sprite svg-search-icon"));
		searchButton.click();
	}
	
	@After
	public void closePage() {
		System.out.println("Webpage is closed after searching");
	}
	@AfterClass
	public static void end() {
		System.out.println("End of test case 2 execution....................");
		System.out.println("-------------------------------------------------");
	}

}
