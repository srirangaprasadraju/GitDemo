package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class TestFF 
{
	public void testFFApplicatin()
	{
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dheshu\\OneDrive\\Selenium Training Videos\\Browser drivers\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.navigate().to("https://classic.crmpro.com/index.html");
	
	driver.manage().window().maximize();
	
	System.out.println("Application launched successfully");
	
	driver.quit();
	
}			

	

}
