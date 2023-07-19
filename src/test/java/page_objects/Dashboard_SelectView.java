package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_SelectView {
	
WebDriver ldriver;
	
	public Dashboard_SelectView(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	//Select View
	
	@FindBy (xpath="//input[@name='username']" )
	private WebElement EmailOrUsername ;

	@FindBy (xpath="//input[@name='password']" )
	private WebElement Password ;

	@FindBy (xpath="//button[@id='loginbut']" )
	private WebElement SubmitButton ;
	
	@FindBy (xpath="/html/body/div[6]/div[2]/div/div[5]/div[1]/div/div[1]/div[1]/select" )
	private WebElement SelectView ;
	
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
   
   public void SlectViewClick() 
   {
	
	SelectView.click();
   }
   
}
