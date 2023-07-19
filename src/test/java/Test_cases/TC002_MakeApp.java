package Test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_objects.Login_page;
import page_objects.MakeApp_page;

public class TC002_MakeApp extends BaseClass {
	
		@BeforeTest
		public void BeforTest() 
		{

		driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		}
		
		@Test 
		
		public void MakeApp () throws InterruptedException 
		{
			driver.get(StaggingLoginbaseURL);
			logger.info("URL is Open");
		
			MakeApp_page mp =  new MakeApp_page (driver);
			
			mp.setEmailOrUsername(EmailOrUsername);
			logger.info("Entered usernam");
			mp.setPassword(Password);
			logger.info("Entererd password");
			mp.SubmitButton();
			logger.info("Login successfully");
			//driver.get(DashboardURL);
					
				mp.clincLogoMV();
				logger.info("Clinc change to MV");
			//	mp.SlectClinic();
				
				mp.searchPatient();
				
				driver.get(SearchPatientURL);
				logger.info("SearchPatientURL is Open");
				 Thread.sleep(3000);
				
				mp.EnterPatName(PatientName);
				Thread.sleep(8000);
				
				mp.clickOnPatInfoButton();
				Thread.sleep(5000);
				mp.ClickOnAttachConsentForm();
				Thread.sleep(7000);
				mp.ClickSelectConcentFormDropdwn();
	     		mp.SelectRegFormChecBox();
	     		mp.ClickOKConcentFormSelection();
				mp.SelectConsentActionDropDwn();
				mp.selectActionSendTextAndEmail();
				mp.ClickOnSubmit();
					if(driver.getTitle().endsWith("SearchPatient"))
					{
						AssertJUnit.assertTrue(true);
						logger.info("SearchPatient test passed");
					}
					else
					{
						AssertJUnit.assertTrue(false);
						logger.info("SearchPatient test failed");
					}
				   }
		} 
						 
					
		
	
