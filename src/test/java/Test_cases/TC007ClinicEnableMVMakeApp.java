package Test_cases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_objects.ClinicEnableMVmakeapp;
import java.util.concurrent.TimeUnit;




public class TC007ClinicEnableMVMakeApp extends BaseClass
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
		driver.get(OnlineAppURLClincMV);
		logger.info("URL is Open");
	
		ClinicEnableMVmakeapp OAppCEMV =  new ClinicEnableMVmakeapp (driver);
		
		OAppCEMV.SelectAppType();
		logger.info("clicked on Select Appointment Type");
		
		OAppCEMV.selectAppTypeAdultRecallNoXray35min();
		logger.info("Appointment Type AdultRecallNoXray35min has been selected ");
		
		Thread.sleep(3000); Thread.sleep(3000);
		
		//OAppCEMV.selectAppDate();
		//logger.info("Selected Appointment Date ");
		
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		
		OAppCEMV.selectAppTime();
		
		Thread.sleep(3000);Thread.sleep(3000);Thread.sleep(3000);Thread.sleep(3000);Thread.sleep(3000);
		
		OAppCEMV.EnterEmailOrNumber(EmailOrNumber);
		Thread.sleep(3000);
		logger.info("Email or number enterd");

		
		OAppCEMV.ClickonSendVerificationCode();
		logger.info("verification code has been sent");

		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);Thread.sleep(5000);Thread.sleep(5000);Thread.sleep(5000);
		OAppCEMV.ClickonAutonticate();
		Thread.sleep(5000);
		logger.info("Authantication complete");

		
		//driver.get(OnlineAppURLClincMVLoginURL);
		//logger.info("Login URL is Open");
		Thread.sleep(5000);
		
		OAppCEMV.ClickonselectPtient();
		Thread.sleep(5000); Thread.sleep(5000);Thread.sleep(5000);Thread.sleep(5000);
		
		OAppCEMV.clickonForWhomWantToBookAppOption1();
		logger.info("click on For Whom Want To BookAppOption1");

		
		OAppCEMV.ClickOnBookApp();
		logger.info("click on book Appointment");
		
		OAppCEMV.EnterCardNumber(CardNumber);
		
		OAppCEMV.EnterExpDate(ExpDate);
		
		OAppCEMV.EnterCVV(CVV);
		
		OAppCEMV.bookAppbutton();
		

	}
}
