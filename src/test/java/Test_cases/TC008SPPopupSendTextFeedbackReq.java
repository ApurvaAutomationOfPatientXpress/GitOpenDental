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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import page_objects.Login_page;
	import page_objects.SPPopupSendTesxtFeedbackReq;

	public class TC008SPPopupSendTextFeedbackReq extends BaseClass {
		
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
			
				SPPopupSendTesxtFeedbackReq STxtFeedbackReq =  new SPPopupSendTesxtFeedbackReq (driver);
				
				STxtFeedbackReq.setEmailOrUsername(EmailOrUsername);
				logger.info("Entered usernam");
				STxtFeedbackReq.setPassword(Password);
				logger.info("Entererd password");
				STxtFeedbackReq.SubmitButton();
				logger.info("Login successfully");
				//driver.get(DashboardURL);
						
				STxtFeedbackReq.clincLogoMV();
					logger.info("Clinc change to MV");
				//	mp.SlectClinic();
					
					STxtFeedbackReq.searchPatient();
					
					driver.get(SearchPatientURL);
					logger.info("SearchPatientURL is Open");
					 Thread.sleep(3000);
					
					 STxtFeedbackReq.EnterPatName(PatientName);
					 
					 logger.info("Search Patient Name");
					 
					Thread.sleep(7000);
					Thread.sleep(7000);
					Thread.sleep(7000);
					STxtFeedbackReq.clickOnPatInfoButton();
					
					logger.info("PatientInfo PopUp is Open");
					
					Thread.sleep(5000);
					STxtFeedbackReq.PatPopUpSendTxtSymbolClick();
					 Thread.sleep(3000);
					 STxtFeedbackReq.selectTamplateTxtMsg();
					 Thread.sleep(3000);
					 STxtFeedbackReq.selectFeedbackRequestTamplate();
					 
					 
					 logger.info("SearchPatientURL is Open");
					 Thread.sleep(5000);
					 Thread.sleep(5000);Thread.sleep(5000);
					 STxtFeedbackReq.clickOnSubmitForTxt();
					 Thread.sleep(5000);Thread.sleep(5000); 
			        logger.info("FeedBack Rquest has been Sent");
}
			}
