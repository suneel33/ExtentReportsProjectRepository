
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportsGeneration {
	@Test
	public void test()
	{
	
		ExtentReports logger=ExtentReports.get(ExtentReportsGeneration.class);
		logger.init("C:\\Mukesh\\myreports.html",true);
		logger.startTest("ExtentReportsGeneration");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\owner\\Desktop\\geckodriver.exe");
	    WebDriver driver =  new FirefoxDriver();
	    logger.log(LogStatus.INFO, "The browser has been launched");
	    driver.manage().window().maximize();
	    logger.log(LogStatus.INFO, "browser has been maximised");
	    driver.get("http://learn-automation.com");
	    logger.log(LogStatus.INFO,"The applications has been opened");
        String title=driver.getTitle();
        String expectedTitle="Selenium";
        Assert.assertTrue(title.equalsIgnoreCase(expectedTitle));
        logger.log(LogStatus.INFO, "Title has been aseerted");
	    driver.quit();
	    logger.log(LogStatus.INFO,"browser has been closed");
	    logger.endTest();
		}
	
}


