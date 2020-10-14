package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class TestChrome 

{

	public void test1()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dheshu\\OneDrive\\Selenium Training Videos\\Browser drivers\\Latest\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://classic.crmpro.com/index.html");
		
		driver.manage().window().maximize();
		
		Reporter.log("Browser is maximised");
		
		System.out.println("Application launched successfully");
		
		driver.quit();
		
}		
		
		



}
