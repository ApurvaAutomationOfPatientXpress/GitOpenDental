package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard
{
	
WebDriver ldriver;
	
	public Dashboard(WebDriver rdriver)
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
	
	//select[@id='dropdown_clinic']
	//select[@id='dropdown_clinic']
	
	@FindBy (xpath="//*[@id=\"headingthree\"]/h5/button/span" )
	private WebElement FRPSClick ;
	
	@FindBy (xpath="/html/body/div[6]/div[2]/div/div[5]/div[2]/div/div/div[2]/div[2]/div/div/a" )
	private WebElement FRPSFormClick ;
	
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
   public void ClickOnFRPS() 
   {
	
      FRPSClick.click();
   }
   
   public void ClickOnFRPSForm() 
   {
	
	   FRPSFormClick.click();
   }
   
  
}