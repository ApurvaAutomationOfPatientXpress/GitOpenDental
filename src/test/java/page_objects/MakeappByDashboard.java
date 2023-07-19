package page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeappByDashboard
{
	
WebDriver ldriver;
	
	public MakeappByDashboard(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	//select clinic
	@FindBy (xpath="//input[@name='username']" )
	private WebElement EmailOrUsername ;

	@FindBy (xpath="//input[@name='password']" )
	private WebElement Password ;

	@FindBy (xpath="//button[@id='loginbut']" )
	private WebElement SubmitButton ;
	
	@FindBy (xpath="/html/body/div[6]/div[2]/div/div[5]/div[1]/div/div[1]/div[2]/select" )
	private WebElement clinicLogo;
	
	@FindBy (xpath="//*[@id=\"dropdown_clinic\"]/option[2]" )
	private WebElement SelectClinic ;
	
	@FindBy (xpath= "//tbody/tr[6]/td[2]")
	private WebElement MakeApptableClick ;
	
	@FindBy (xpath= "//i[@class='fa fa-user']")
	private WebElement patientinfoClick ;
	
	//*[@id="calender"]/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[7]/td[2]
	
	@FindBy (xpath= "//*[@id=\"apptforyou\"]/div[1]/label[2]")
	private WebElement ClickOnNewPatient ;
	
	//label[@for='radionew']
	
	
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
   
   public void SlectClinic() 
   {
	
	SelectClinic.click();
   }
   
   public void clickmkapp() 
   {
	
	   MakeApptableClick.click();
   }
   
   public void clickonnwpat() 
   {
	
	   ClickOnNewPatient.click();
   }
   
   public void clickOnPatInfoButton() 
   {
	
	   patientinfoClick.click();
   }
  
   
   
  
}
