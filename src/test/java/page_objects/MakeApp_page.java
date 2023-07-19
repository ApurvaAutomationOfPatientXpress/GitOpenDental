package page_objects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class MakeApp_page {
		 
		WebDriver ldriver;
		
		public MakeApp_page(WebDriver rdriver)
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
	
		@FindBy (xpath= "//i[@class='fa fa-link']")
		private WebElement ClickOnAttachConcent;
		//*[@id="test"]/div/p/label
		@FindBy (xpath= "//*[@id=\"test\"]/div/p/span")
		private WebElement clickSelectConcentFormDropdwn ;
		
		@FindBy (xpath= "//*[@id=\"test\"]/div/div/ul/li[2]/label")
		private WebElement selectRegFormChecBox ;
		
		@FindBy (xpath= "//*[@id=\"test\"]/div/div/div/p[1]")
		private WebElement ClicOKConcentFormSelection ;
		
		
		@FindBy (xpath= "//*[@id=\"ConsentListModal\"]/div/div/div[2]/div[2]/div/div/p/span")
		private WebElement SelectActionDropdwn ;
		
		@FindBy (xpath= "//*[@id=\"ConsentListModal\"]/div/div/div[2]/div[2]/div/div/div/ul/li[6]/label")
		private WebElement SelectActionSendTextAndEmail ;
	
		@FindBy (xpath= "/html/body/div[7]/div/div/div[3]/button[2]")
		private WebElement ClickONSubmitForms ;
		
		//*[@id="ConsentListModal"]/div/div/div[3]/button[2]
		
		//@FindBy (xpath="(//option[@value=\"1\"])[1]" )
		//private WebElement SelectClinic ;

		//@FindBy (xpath= "/html/body/div[6]/div[2]/div/div[5]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[9]/td[2]")
		//private WebElement MakeApp ;

		
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
	 public void  ClickOnAttachConsentForm() 
	   {
		
		 ClickOnAttachConcent.click();
	   }
	 public void  ClickSelectConcentFormDropdwn() 
	   {
		
		 clickSelectConcentFormDropdwn.click();
	   }
	 
	 public void SelectRegFormChecBox() 
	   {
		
		 selectRegFormChecBox.click();
	   }
	 public void ClickOKConcentFormSelection() 
	   {
		
		 ClicOKConcentFormSelection.click();
	   }
	 public void SelectConsentActionDropDwn() 
	   {
		
		 SelectActionDropdwn.click();
	   }
	 
	 public void  selectActionSendTextAndEmail () 
	   {
		
		 SelectActionSendTextAndEmail.click();
	   } 
	 public void ClickOnSubmit() 
	   {
		
		 ClickONSubmitForms.click();
	   } 
	 
	
	 
	}
	
	
	//public void SlectClinic() {
	
	//	SelectClinic.click();
//	}

	 
	


