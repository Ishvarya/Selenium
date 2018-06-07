import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ishvarya\\Selenium\\SeleniumDrivers\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.wikipedia.org/");
		//Method1: Selection of an option using sendKeys
		//firefoxDriver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Dansk");
		
		//Method2: Selection of an option using select class - select by value and select by visible text
		Select select = new Select(firefoxDriver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")));
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		System.out.println("----------------Method 1: Printing all the values in the dropdown list------------");
		
		//Method 1: Using Select class
		//to print the size of the drop down list
		List<WebElement> options = select.getOptions();
		System.out.println("Total number of options are "+options.size());
		
		//to extract all values from the dropdown list
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			System.out.println(options.get(i).getAttribute("value"));
			System.out.println(options.get(i).getAttribute("lang"));
		}
		
		System.out.println("----------------Method 2: Printing all the values in the dropdown list------------");
		
		//Method 2: Using findElements - this will print down all the options in the page. Incase of multiple dropdown list, all options will be printed.
		//to print the size of the drop down list
		List<WebElement> options2 = firefoxDriver.findElements(By.tagName("option"));
		System.out.println("Total number of options are "+ options2.size());
		
		//to extract all values from the dropdown list
		for(int i=0;i<options2.size();i++) {
			System.out.println(options2.get(i).getText());
			System.out.println(options2.get(i).getAttribute("value"));
			System.out.println(options2.get(i).getAttribute("lang"));
		}
		
		System.out.println("----------------Printing all the links in the page------------");
		//Printing all the links in the page
		//to print the total number of links
		List<WebElement> links = firefoxDriver.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+links.size());
				
		//to print all links
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getAttribute("title"));
		}
		
		System.out.println("----------------Printing the links in a specific block in the page------------");
		//Printing the links in a specific block in the page
		WebElement block = firefoxDriver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]"));
		List<WebElement> links2 = block.findElements(By.tagName("a"));
		System.out.println("Total number of links2 are "+links2.size());
		
		//to print the links
		for(int i=0;i<links2.size();i++) {
			System.out.println(links2.get(i).getText());
		}
	}

}
