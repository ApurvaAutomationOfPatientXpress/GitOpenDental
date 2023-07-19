package Test_cases;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import page_objects.Login_page;
	import page_objects.SPPopUpSendTxtFastBookApp;

	public class TC006SPPopUpSendTxtFastBookApp extends BaseClass {
		static Actions action;
		
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
			
				SPPopUpSendTxtFastBookApp STxtFastBookApp =  new SPPopUpSendTxtFastBookApp (driver);
				
				STxtFastBookApp.setEmailOrUsername(EmailOrUsername);
				logger.info("Entered usernam");
				STxtFastBookApp.setPassword(Password);
				logger.info("Entererd password");
				STxtFastBookApp.SubmitButton();
				logger.info("Login successfully"); 
				//driver.get(DashboardURL);
						
				STxtFastBookApp.clincLogoMV();
					logger.info("Clinc change to MV");
				//	mp.SlectClinic();
					
					STxtFastBookApp.searchPatient();
					
					driver.get(SearchPatientURL);
					logger.info("SearchPatientURL is Open");
					 Thread.sleep(3000);
					
					 STxtFastBookApp.EnterPatName(PatientName);
					 
					 logger.info("Search Patient Name");
					 
					Thread.sleep(7000);
					Thread.sleep(7000);
					Thread.sleep(7000);
					STxtFastBookApp.clickOnPatInfoButton();
					
					logger.info("PatientInfo PopUp is Open");
					
					Thread.sleep(5000);
					STxtFastBookApp.PatPopUpSendTxtSymbolClick();
					logger.info("clicked on PatientInfo PopUp send text symbol");

					 Thread.sleep(3000);
					 STxtFastBookApp.selectTamplateTxtMsg();
						logger.info("selected template text msg ");

					 Thread.sleep(3000);
					 STxtFastBookApp.selectFastBookAppTamplate();
						logger.info("fastbook aap template selected");

					 Thread.sleep(3000);
					 STxtFastBookApp.selectClinicfastbkApp();
						logger.info("Clinic options are open  for fastbook app");

					 Thread.sleep(3000);
					//action.moveToElement( STxtFastBookApp.SelectClinicMVFatbookApp).keyDown(Keys.ARROW_DOWN).build().perform();
					 logger.info("clicked On Clinc Arrow");
					// logger.info("SearchPatient FastBookApp Template is Open");
					 STxtFastBookApp.selectClinicMVFatbookApp();
					 Thread.sleep(2000);
					 STxtFastBookApp.ClickFormvclinic();
					
					 Thread.sleep(2000);Thread.sleep(5000);
					 
					 STxtFastBookApp.submitForSelectedClinicMV();
					 Thread.sleep(5000);
					 
					//STxtFastBookApp.submitForSelectedClinicMV();
					 STxtFastBookApp.clickOnSubmitForTxt();
					 Thread.sleep(5000);Thread.sleep(5000); 
			        logger.info("FastBookApp Template  Msg Sent");
}
			}
