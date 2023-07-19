package Test_cases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_objects.MakeappByDashboard;
import java.util.concurrent.TimeUnit;




public class TC003MakeAppByDashboard extends BaseClass
{
 
	@BeforeTest
	public void BeforTest() 
	{

	driver = new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}
	
	@Test 
	
	public void Dashboard () throws InterruptedException 
	{
		driver.get(StaggingLoginbaseURL);
		logger.info("URL is Open");
	
		MakeappByDashboard MA =  new MakeappByDashboard (driver);
		
		MA.setEmailOrUsername(EmailOrUsername);
		logger.info("Entered usernam");
		MA.setPassword(Password);
		logger.info("Entererd password");
		MA.SubmitButton();
		driver.get(DashboardURL);
		MA.SlectClinic();	
			MA.clincLogoMV();
			
			Thread.sleep(3000);
			MA.clickmkapp();
			Thread.sleep(5000);
			MA.clickOnPatInfoButton();
			Thread.sleep(5000);
			//MA.
			// Alert alert = driver.switchTo().alert();
			  
			//   driver.switchTo().alert().accept();
			   
			
			//MA.clickonnwpat();
			
			 {
					if(driver.getTitle().endsWith("DashBoard"))
					{
						AssertJUnit.assertTrue(true);
						logger.info("DashBoard make app test passed");
					}
					else
					{
						AssertJUnit.assertTrue(false);
						logger.info("DashBoard make app  test failed");
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
