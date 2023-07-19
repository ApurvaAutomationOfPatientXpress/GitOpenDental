package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClinicEnableMVmakeapp {
	
WebDriver ldriver;
	
	public ClinicEnableMVmakeapp(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	//Online Appointmentclinc Enable Mv
	
	@FindBy (xpath="//select[@id='AppointentType_patient']" )
	private WebElement SelectAppType ;
	
	@FindBy (xpath="//*[@id=\"AppointentType_patient\"]/option[3]" )
	private WebElement SelectAppTypeAdultRecallNoXray35min ;
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[3]/div/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[6]" )
	private WebElement SelectAppDate ;
	
	@FindBy (xpath="//*[@id=\"slots\"]/div[1]" )
	private WebElement SelectAppTime ;
	
	@FindBy (xpath="//*[@id=\"Phonenumber\"]" )
	private WebElement EmailOrNumber ;
	
	@FindBy (xpath="//*[@id=\"SendPin\"]" )
	private WebElement clickonSendVerificationCode ;
	
	@FindBy (xpath="//*[@id=\"AuthenticateOTP\"]" )
	private WebElement clickonAutonticate ;
	
	@FindBy (xpath="(//button[@class='btn btn-primary float-right btn-sm'])[1]" )
	private WebElement clickonselectPtient ;
	
	//*[@id="jconfirm-box99977"]/div/ul/li[1]/button
	//*[@id="jconfirm-box21222"]/div/ul/li[1]/button
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/form/fieldset[1]/div[1]/div/label[1]" )
	private WebElement clickonForWhomWantToBookAppOption1 ;
	
	@FindBy (xpath="//*[@id=\"radself\"]" )
	private WebElement ClickOnPtientForApp ;

	@FindBy (xpath="//*[@id=\"BookAppointmentPayment\"]" )
	private WebElement ClickOnBookApp ;
	
	@FindBy (xpath="//*[@id=\"cardnumber\"]\r\n" )
	private WebElement CardNumber;

	@FindBy (xpath="//*[@id=\"cvv\"]" )
	private WebElement CVV;
	
	@FindBy (xpath="//*[@id=\"expdate\"]\r\n")
    private WebElement ExpDate;
	
	@FindBy (xpath="//*[@id=\"PatientPaymentForm\"]/fieldset[2]/input[2]" )
	private WebElement BookAppbutton; 

	//*[@id="BookAppointmentPayment"]
	//*[@id="radself"]
	//*[@id="radself"]
	//*[@id="AuthenticateOTP"]
	//*[@id="SendPin"]
	//*[@id="Phonenumber"]
	//*[@id="datetimepicker4"]/div/div[3]/div[2]/div[6]
	//*[@id="AppointentType_patient"]/option[2]
	
	 public void SelectAppType ()
	   {
		 SelectAppType.click();
		
	   }
	 
	 public void selectAppTypeAdultRecallNoXray35min  ()
	   {
		 SelectAppTypeAdultRecallNoXray35min .click();
		
	   }
	 
	 
	 public void selectAppDate ()
	   {
		 SelectAppDate.click();
		}
	 
	 public void selectAppTime ()
	   {
		 SelectAppTime.click();
		}
	
	
	 public void EnterEmailOrNumber( String EmailOrNum)
     {
		 EmailOrNumber.sendKeys(EmailOrNum);
	 }
	
	 public void  ClickonSendVerificationCode()
	   {
		 clickonSendVerificationCode.click();
	   }
	 
	
	 public void ClickonAutonticate()
	   {
		 clickonAutonticate.click();
	   }
	
	 public void ClickonselectPtient()
	   {
		 clickonselectPtient.click();
	   }
	 
	
	 public void clickonForWhomWantToBookAppOption1()
	   {
		 clickonForWhomWantToBookAppOption1.click();
	   }
	
	
	 public void ClickOnBookApp()
	   {
		 ClickOnBookApp.click();
	   }
	 
	
	 public void bookAppbutton()
	   {
		 BookAppbutton.click();
	   }
	 
	 public void EnterCardNumber(String cardNumber)
     {
		 CardNumber.sendKeys(cardNumber);
	 }

	 public void EnterCVV(String cvv)
     {
		 CVV.sendKeys(cvv);
	 }
	 
	 public void EnterExpDate(String expdate)
     {
		 ExpDate.sendKeys(expdate);
	 }
	 
	
	 
	
	 
	/* 
	  public void clickOnPtientForApp()
	   {
		 ClickOnPtientForApp.click();
	   }
	   
	   */
	 
	 
	 
	 
	 
	 
}
