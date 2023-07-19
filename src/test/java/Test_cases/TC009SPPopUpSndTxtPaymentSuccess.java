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
	import page_objects.SPPopUpSndTxtPaymentSuccess;

	public class TC009SPPopUpSndTxtPaymentSuccess extends BaseClass {
		
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
			
				SPPopUpSndTxtPaymentSuccess STxtPaymentSuccess =  new SPPopUpSndTxtPaymentSuccess (driver);
				
				STxtPaymentSuccess .setEmailOrUsername(EmailOrUsername);
				logger.info("Entered usernam");
				STxtPaymentSuccess .setPassword(Password);
				logger.info("Entererd password");
				STxtPaymentSuccess .SubmitButton();
				logger.info("Login successfully");
				//driver.get(DashboardURL);
						
				STxtPaymentSuccess .clincLogoMV();
					logger.info("Clinc change to MV");
				//	mp.SlectClinic();
					STxtPaymentSuccess .searchPatient();
					
					driver.get(SearchPatientURL);
					logger.info("SearchPatientURL is Open");
					 Thread.sleep(3000);
					
					 STxtPaymentSuccess .EnterPatName(PatientName);
					 
					 logger.info("Search Patient Name");
					 
					Thread.sleep(7000);
					Thread.sleep(7000);
					Thread.sleep(7000);
					STxtPaymentSuccess .clickOnPatInfoButton();
					
					logger.info("PatientInfo PopUp is Open");
					
					Thread.sleep(5000);
					STxtPaymentSuccess .PatPopUpSendTxtSymbolClick();
					 Thread.sleep(3000);
					 STxtPaymentSuccess .selectTamplateTxtMsg();
					 Thread.sleep(3000);
					 STxtPaymentSuccess.paymentSuccessTamplate();
					 
					 logger.info("SearchPatientURL is Open");
					 Thread.sleep(5000);
					 Thread.sleep(5000);Thread.sleep(5000);
					 STxtPaymentSuccess .clickOnSubmitForTxt();
					 Thread.sleep(5000);Thread.sleep(5000); 
			        logger.info("Appointment Confirmation Msg Sent");
}
			}
