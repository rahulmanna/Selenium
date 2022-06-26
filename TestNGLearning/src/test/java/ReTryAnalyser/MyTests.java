package ReTryAnalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests 
{
	@Test(retryAnalyzer=RetryAnalyser.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, false);
	}

}
