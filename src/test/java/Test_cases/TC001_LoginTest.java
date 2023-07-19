package Test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_objects.Login_page;
import java.util.concurrent.TimeUnit;

public class TC001_LoginTest extends BaseClass{
@BeforeTest
public void BeforTest() 
{

driver = new ChromeDriver ();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.manage().window().maximize();

}

	@Test
	public void logintest ()
	{
		driver.get(StaggingLoginbaseURL);
		logger.info("URL is Open");
	
		Login_page lp = new Login_page (driver);
		
		lp.setEmailOrUsername(EmailOrUsername);
		logger.info("Entered usernam");
		lp.setPassword(Password);
		logger.info("Entererd password");
		lp.SubmitButton();
		
	   {
		if(driver.getTitle().endsWith("Login"))
		{
			AssertJUnit.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			AssertJUnit.assertTrue(false);
			logger.info("Login test failed");
		}
	   }
		}
	
	@AfterMethod 
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void clearPOMObjects () 
	{
		 
	}
@AfterTest
public void AfterTest()
{
	
	driver.close();
	System.gc() ;
}
	
}
