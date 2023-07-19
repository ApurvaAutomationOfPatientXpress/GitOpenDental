package Test_cases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_objects.DashboardFRPS;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class DashboardElementFRPS extends BaseClass
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
	
		DashboardFRPS FRPS =  new DashboardFRPS (driver);
		
		FRPS.setEmailOrUsername(EmailOrUsername);
		logger.info("Entered usernam");
		FRPS.setPassword(Password);
		logger.info("Entererd password");
		FRPS.SubmitButton();
		logger.info("log In sucessfully");
		driver.get(DashboardURL);
		Thread.sleep(8000);
		FRPS.clincLogoMV();
		FRPS.SlectClinic();
		Thread.sleep(8000);
		logger.info("Cliniv Change to MV");
		FRPS.SlectFRPSClick();
		Thread.sleep(8000);
		logger.info("FRPS Clicked");
		
		//driver.switchTo().frame();
		Thread.sleep(8000);
		Thread.sleep(8000);
		//Thread.sleep(8000);
		logger.info("FRPS option Clicked but Forms not open till");

		FRPS.SlectFRPSFormClick();
		logger.info("Patient Form selected and Open");
		 
	     
		/*
		 {
				if(driver.getTitle().endsWith("Patient Registration Form"))
				{
					AssertJUnit.assertTrue(true);
					logger.info("DashBoardFRPS test passed");
				}
				else
				{
					AssertJUnit.assertTrue(false);
					logger.info("DashBoardFRPS test failed");
				}
			   }
				*/
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
		//System.gc() ;
	}
		

	}

