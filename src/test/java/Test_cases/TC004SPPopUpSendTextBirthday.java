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
	import page_objects.SPPopUpSendTextBirthday;
import page_objects.SPPopUpSendTextBirthday;

	public class TC004SPPopUpSendTextBirthday extends BaseClass {
		
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
			
				SPPopUpSendTextBirthday STxtbirthday =  new SPPopUpSendTextBirthday (driver);
				
				STxtbirthday.setEmailOrUsername(EmailOrUsername);
				logger.info("Entered usernam");
				STxtbirthday.setPassword(Password);
				logger.info("Entererd password");
				STxtbirthday.SubmitButton();
				logger.info("Login successfully");
				//driver.get(DashboardURL);
						
				STxtbirthday.clincLogoMV();
					logger.info("Clinc change to MV");
				//	mp.SlectClinic();
					
					STxtbirthday.searchPatient();
					
					driver.get(SearchPatientURL);
					logger.info("SearchPatientURL is Open");
					 Thread.sleep(3000);
					
					 STxtbirthday.EnterPatName(PatientName);
					 
					 logger.info("Search Patient Name");
					 
					Thread.sleep(7000);
					Thread.sleep(7000);
					Thread.sleep(7000);
					STxtbirthday.clickOnPatInfoButton();
					
					logger.info("PatientInfo PopUp is Open");
					
					Thread.sleep(5000);
					STxtbirthday.PatPopUpSendTxtSymbolClick();
					 Thread.sleep(3000);
					 STxtbirthday.selectTamplateTxtMsg();
					 Thread.sleep(3000);
					 STxtbirthday.selectBirthdayTamplate();
					 
					 logger.info("SearchPatient BiryhdayTemplate is Open");
					 Thread.sleep(5000);
					 Thread.sleep(5000);Thread.sleep(5000);
					 STxtbirthday.clickOnSubmitForTxt();
					 Thread.sleep(5000);Thread.sleep(5000); 
			        logger.info("BiryhdayTemplate  Msg Sent");
}
			}
