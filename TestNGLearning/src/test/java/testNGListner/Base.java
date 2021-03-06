package testNGListner;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

	public void failed(String testmethodname) {
		TakesScreenshot scr = ((TakesScreenshot) driver);
		File pagescreenshot = scr.getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(pagescreenshot, new File("C:\\Rahul\\Selenium Learning 2022\\TestNGLearning\\Screenshot\\"
					//+ "screenshot_"+ this.getClass().getName() + "_" + ".jpg"));
			
			FileUtils.copyFile(pagescreenshot, new File("C:\\Rahul\\Selenium Learning 2022\\TestNGLearning\\Screenshot\\"
					+testmethodname+ "_" + ".jpg"));	
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
