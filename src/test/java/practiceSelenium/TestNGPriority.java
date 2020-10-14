package practiceSelenium;

import org.testng.annotations.Test;

public class TestNGPriority 
{
	@Test(priority=3)
	public void firstTest()
	{
		System.out.println("This is the first priority");
		
	}
	@Test(priority=2)
	public void secondTest()
	{
		System.out.println("This is the second priority");
		
	}
	@Test(priority=1)
	public void thirdTest()
	{
		System.out.println("This is the third priority");
		
	}
	
	@Test(dependsOnMethods= {"thirdTest","secondTest"})
	public void fourthTest()
	{
		System.out.println("This is the fourth priority");
		
	}
	@Test(groups="Regression")
	public void sampleTest()
	{
		System.out.println("This is the regression test");
		
	}
	

}
