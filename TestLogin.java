import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ishvarya\\Selenium\\SeleniumDrivers\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishvarya\\Selenium\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ishvarya\\Selenium\\SeleniumDrivers\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		WebDriver ieDriver = new InternetExplorerDriver();*/
		
		//to go to the website
		firefoxDriver.get("http://gmail.com");
		//to get the title of the web page
		System.out.println(firefoxDriver.getTitle());
		//to locate an element say text box
		WebElement usernameText = firefoxDriver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		//to type text in the element
		usernameText.sendKeys("contact.ishvarya@gmail.com");
		
		WebElement submitButton = firefoxDriver.findElement(By.id("identifierNext"));
		submitButton.click();

	}

}
