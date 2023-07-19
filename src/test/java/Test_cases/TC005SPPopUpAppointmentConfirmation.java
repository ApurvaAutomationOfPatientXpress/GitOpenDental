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
	import page_objects.SPPopUpAppointmentConfirmation;

	public class TC005SPPopUpAppointmentConfirmation extends BaseClass {
		
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
			
				SPPopUpAppointmentConfirmation STxtAppConfirm =  new SPPopUpAppointmentConfirmation (driver);
				
				STxtAppConfirm.setEmailOrUsername(EmailOrUsername);
				logger.info("Entered usernam");
				STxtAppConfirm.setPassword(Password);
				logger.info("Entererd password");
				STxtAppConfirm.SubmitButton();
				logger.info("Login successfully");
				//driver.get(DashboardURL);
						
				STxtAppConfirm.clincLogoMV();
					logger.info("Clinc change to MV");
				//	mp.SlectClinic();
					
					STxtAppConfirm.searchPatient();
					
					driver.get(SearchPatientURL);
					logger.info("SearchPatientURL is Open");
					 Thread.sleep(3000);
					
					 STxtAppConfirm.EnterPatName(PatientName);
					 
					 logger.info("Search Patient Name");
					 
					Thread.sleep(7000);
					Thread.sleep(7000);
					Thread.sleep(7000);
					STxtAppConfirm.clickOnPatInfoButton();
					
					logger.info("PatientInfo PopUp is Open");
					
					Thread.sleep(5000);
					STxtAppConfirm.PatPopUpSendTxtSymbolClick();
					 Thread.sleep(3000);
					 STxtAppConfirm.selectTamplateTxtMsg();
					 Thread.sleep(3000);
					 STxtAppConfirm.selectAppointmentConfirmationTamplateTamplate();
					 
					 logger.info("SearchPatientURL is Open");
					 Thread.sleep(5000);
					 Thread.sleep(5000);Thread.sleep(5000);
					 STxtAppConfirm.clickOnSubmitForTxt();
					 Thread.sleep(5000);Thread.sleep(5000); 
			        logger.info("Appointment Confirmation Msg Sent");
}
			}
