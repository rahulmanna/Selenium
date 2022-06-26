package ParallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BastTest
{
    @Test(invocationCount=5)
	public void executeTest()
	{
		//System.out.println("Launching chrome browser!");
		
		driver=getDriver("chrome");
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
