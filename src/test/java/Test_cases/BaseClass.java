package Test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import com.utilities.Readconfig;
public class BaseClass {

	Readconfig readconfig = new Readconfig ();
	
	public String StaggingLoginbaseURL = readconfig.getApplicationURL();
	public String DashboardURL = readconfig.getDashboardURL();
	public String SearchPatientURL= readconfig.getSearchPatientURL();
	public String EmailOrUsername=readconfig.getUsername();
	public String Password =readconfig.getPassword();
	public String PatientName = readconfig.getPatName();
	public String callLogsDate = readconfig.getCallLogsDate();
	public String callLogsURL = readconfig.getCallLogsURL();
	public String chromepath = readconfig.getChromepath();
	public String NewPatientFormURL = readconfig.getNewPatientFormURL();
	public String PatientRegistrationFormURL = readconfig.getPatientRegistrationFormURL();
	public String OnlineAppURLClincMV = readconfig.getOnlineAppURLClincMV();
	public String CardNumber = readconfig.getCardNumber();
	public String CVV = readconfig.getCVV();
	public String ExpDate = readconfig.getExpDate();
    public String EmailOrNumber = readconfig.getEmailOrNumber();
	public String OnlineAppURLClincMVLoginURL = readconfig.OnlineAppURLClincMVLoginURL();
	public static WebDriver driver;
	
	public static Logger logger;
	
	

@BeforeClass

public void setup() {
	System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
	 
	 
	 logger = Logger.getLogger ("opendental");
	 PropertyConfigurator.configure("Log4j.¡roperties");
	}

@AfterMethod
public void AfterMethod()
{
	

}


@AfterClass
public void tearDown()
{
	//driver.quit();

}


	}



