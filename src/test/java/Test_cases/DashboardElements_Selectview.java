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
import page_objects.Dashboard_SelectView;
import java.util.concurrent.TimeUnit;




public class DashboardElements_Selectview extends BaseClass
{
 
	@BeforeTest
	public void BeforTest() 
	{

	driver = new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}
	
	@Test 
	
	public void Dashboard () 
	{
		driver.get(StaggingLoginbaseURL);
		logger.info("URL is Open");
	
		Dashboard_SelectView SV =  new Dashboard_SelectView (driver);
		
		SV.setEmailOrUsername(EmailOrUsername);
		logger.info("Entered usernam");
		SV.setPassword(Password);
		logger.info("Entererd password");
		SV.SubmitButton();
		driver.get(DashboardURL);
		SV.SlectViewClick();
			
		 {
				if(driver.getTitle().endsWith("DashBoard"))
				{
					AssertJUnit.assertTrue(true);
					logger.info("DashBoardSelectView test passed");
				}
				else
				{
					AssertJUnit.assertTrue(false);
					logger.info("DashBoardSelectView test failed");
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
		
		//driver.close();
		System.gc() ;
	}
		

	}

