package page_objects;

	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SPPopUpSendTxtFastBookApp {
		static Actions action;
		 
		WebDriver ldriver;
		
		public SPPopUpSendTxtFastBookApp(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver,this);
			
		}
		
		@FindBy (xpath="//input[@name='username']" )
		private WebElement EmailOrUsername ;

		@FindBy (xpath="//input[@name='password']" )
		private WebElement Password ;

		@FindBy (xpath="//button[@id='loginbut']" )
		private WebElement SubmitButton ;
		
		@FindBy (xpath="/html/body/div[6]/div[2]/div/div[5]/div[1]/div/div[1]/div[2]/select" )
		private WebElement clinicLogo;
    	@FindBy (xpath="//*[@id=\"searchpatient\"]" )
    	private WebElement SearchPatient ;
		
		@FindBy (xpath="//input[@type='search']" )
	    private WebElement PatientName ;
		
		@FindBy (xpath= "//i[@class='fa fa-user']")
		private WebElement patientinfoClick ;
		
		@FindBy (xpath= "//*[@id=\"number\"]/a/img")
		private WebElement patPopUpSendTxtSymbolClick ;
		
		@FindBy (xpath= "//*[@id=\"smstemps\"]")
		private WebElement SelectTamplateTxtMsg ;
		
		@FindBy (xpath= "//*[@id=\"smstemps\"]/option[11]")
		private WebElement SelectFastBookAppTamplate;
		//*[@id="selclinictxt"]/option[2]

		@FindBy (xpath= "//*[@id=\"selclinictxt\"]")
		private WebElement SelectClinicfastbkApp ;
		
		@FindBy (xpath= "//*[@id=\"selclinictxt\"]/option[2]")
		public WebElement SelectClinicMVFatbookApp;
		
		@FindBy (xpath= "//*[@id=\\\"selclinictxt\\\"]/option[2]")
		public WebElement clickFormvclinic;
	
		
		//   (//option[@value="1"])[1]
		//*[@id="selclinictxt"]
		@FindBy (xpath= "//*[@id=\"btnSubmittxt\"]")
		private WebElement SubmitForSelectedClinicMV ;
		
		@FindBy (xpath= "//*[@id=\"btnSubmit\"]")
		private WebElement ClickOnSubmitForTxt;
		
		
		//*[@id="btnSubmit"]
		//*[@id="smstemps"]/option[7]
		//*[@id="smstemps"]
		//*[@id="number"]/a/img
		
		 public void setEmailOrUsername( String uname)
	     {
		    EmailOrUsername.sendKeys(uname);
		
	     }

	    public void setPassword (String pswd)
	     {
	    	Password.sendKeys(pswd);
		
	     }

	public void SubmitButton ()
	   {
		   SubmitButton.click();
		
	   }

	
	public void clincLogoMV()
	{
		

		clinicLogo.click();
	}
	public void searchPatient()
	{
		

		 SearchPatient.click();
	}
	
	
	 public void EnterPatName( String PatName)
     {
		 PatientName.sendKeys(PatName);
	
     }
	 public void clickOnPatInfoButton() 
	   {
		
		   patientinfoClick.click();
	   }
	 public void  PatPopUpSendTxtSymbolClick() 
	   {
		
		 patPopUpSendTxtSymbolClick.click();
	   }
	 public void  selectTamplateTxtMsg()
	   {
		
		   SelectTamplateTxtMsg.click();
	   }
	 
	 public void selectFastBookAppTamplate() 
	   {
		
		 SelectFastBookAppTamplate.click();
	   }
	 public void selectClinicfastbkApp() 
	   {
		
		 SelectClinicfastbkApp.click();
	   }
	 
	 
	 public void selectClinicMVFatbookApp() 
	   {
		
		  SelectClinicMVFatbookApp.click();
		 action.moveToElement(SelectClinicMVFatbookApp).keyDown(Keys.ARROW_DOWN).build().perform();

	   }
	 public void ClickFormvclinic() 
	   {
		
		 clickFormvclinic.click();
	   }
	
	 public void submitForSelectedClinicMV() 
	   {
		
		 SubmitForSelectedClinicMV.click();
	   }
	 public void clickOnSubmitForTxt() 
	   {
		
		 ClickOnSubmitForTxt.click();
	   }
	 
	 
}
