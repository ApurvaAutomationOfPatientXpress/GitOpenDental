package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardFRPS {
	
WebDriver ldriver;
	
	public DashboardFRPS(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	//Select Form Required Patient Signature
	
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
	
	
	@FindBy (xpath="/html/body/div[6]/div[2]/div/div[5]/div[2]/div/div/div[1]/h5/button/i" )
	private WebElement SelectFRPS ;
	  ///html/body/div[6]/div[2]/div/div[5]/div[2]/div/div/div[1]/h5/button/i   --refresh buttonfullxpath
	//*[@id="headingthree"]/h5/button/span
	//*[@id=\"headingthree\"]/h5/button
	//*[@id=\"noCkickR\"] - refresh button
	@FindBy (xpath="//*[@id=\"Concent\"]/a[1]")
	private WebElement SelectFRPSForm ;
	//*[@id="Concent"]
	//*[@id=\"Concent\"]/a[1]
	@FindBy (xpath="//*[@id=\"canvas_1\"]")
	private WebElement signatureCanvas ;
	
	
	//*[@id="canvas_1"]  = Canvas sign Patient
	//*[@id="submitx"]   = Submit for concent form
	
	//*[@id=\"collapsethree\"]/div[1]
	
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
   
   public void SlectFRPSClick() 
   {
	
	   SelectFRPS.click();
   }
   public void SlectFRPSFormClick() 
   {
	
	   SelectFRPSForm.click();
	   
   }
   public void signatureCanvasClick() 
   {
	  
	 		Actions actions =new Actions(ldriver);
	 	       actions.dragAndDropBy(signatureCanvas , 200, 0).build().perform();
	  
	   
   }
   
   
   
   
   
}

