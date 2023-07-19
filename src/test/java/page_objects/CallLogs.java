package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallLogs {
	
WebDriver ldriver;
	
	public CallLogs(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	//Select callLogs
	
	@FindBy (xpath="//input[@name='username']" )
	private WebElement EmailOrUsername ;

	@FindBy (xpath="//input[@name='password']" )
	private WebElement Password ;

	@FindBy (xpath="//button[@id='loginbut']" )
	private WebElement SubmitButton ;
	
	@FindBy (xpath="//*[@id=\"Calllog\"]/a" )
	private WebElement CallLogs;
	
	@FindBy (xpath="//*[@id=\"content-wrapper\"]/div/div[3]/form/div/div/div[3]/div/button" )
	private WebElement CallLogsSearchButton;
	
	@FindBy (xpath="//input[@class='form-control control-full-width']" )
	private WebElement CallLogSarchBox ;
	
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
   
   public void CallLogsClick() 
   {
	
	CallLogs.click();
   }
   
   public void CallLogSarchBox( String CallLogDate)
   {
	   CallLogSarchBox.sendKeys(CallLogDate);
	
   }
   
   
   public void CallLogsSearchButtonClick() 
   {
	
	   CallLogsSearchButton.click();
   }
   
   
}

//input[@class='form-control control-full-width']