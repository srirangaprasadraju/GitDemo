package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class TestIE 
{		

		public void testIE()
		{
			
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Dheshu\\OneDrive\\Selenium Training Videos\\Browser drivers\\IEDriverServer.exe");
			
			WebDriver driver = new InternetExplorerDriver();
			
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.navigate().to("https://classic.crmpro.com/index.html");
			
			driver.manage().window().maximize();
			
			System.out.println("Application launched successfully");
			
			driver.quit();
			
	}			


	}


