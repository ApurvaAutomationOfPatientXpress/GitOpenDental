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
import page_objects.CallLogs;
import java.util.concurrent.TimeUnit;




public class CallLogsElements extends BaseClass
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
	
		CallLogs CL =  new CallLogs (driver);
		
		CL  .setEmailOrUsername(EmailOrUsername);
		logger.info("Entered usernam");
		CL .setPassword(Password);
		logger.info("Entererd password");
		CL .SubmitButton();
		driver.get(DashboardURL);
		CL.CallLogsClick();
		//CL.CallLogSarchBox(callLogsDate);
		CL .CallLogsSearchButtonClick();
		
		
		{
				if(driver.getTitle().endsWith("Call"))
				{
					AssertJUnit.assertTrue(true);
					logger.info("callLogsURL test passed");
				}
				else
				{
					AssertJUnit.assertTrue(false);
					logger.info("callLog test failed");
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


