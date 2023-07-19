 package com.utilities;

import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;


public class Readconfig {

	
		
		Properties pro;
		
		public Readconfig () {
			
			File src = new File("Configuration\\config.properties");
			
			try 
			
			{
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties ();
				pro.load(fis);
		
			}
			catch (Exception e)
			{
				System.out.println("Exception is" + e.getMessage());
			}

	}
		
		public String getApplicationURL() 
		{
		String baseURL=pro.getProperty("StaggingLoginbaseURL");
		return baseURL;
		}
		
		public String getCallLogsURL() 
		{
		String CallLogsURL=pro.getProperty("CallLogsURL");
		return CallLogsURL;
		}
		public String getSearchPatientURL() 
		{
		String SearchPatientURL=pro.getProperty("SearchPatientURL");
		return SearchPatientURL;
		}

		public String getDashboardURL() 
		{
		String DashboardURL=pro.getProperty("DashboardURL");
		return DashboardURL;
		}
		
		
		public String getUsername ()
		{
			String EmailOrUsername=pro.getProperty("EmailOrUsername");
			return EmailOrUsername;
		}
		
		public String getPassword ()
		{
			String Password=pro.getProperty("Password");
			return Password;
		}
		public String getChromepath ()
		{
			String chromepath=pro.getProperty("chromepath");
			return chromepath;
		}

		public String getCallLogsDate()
		{
			
			String CallLogsDate=pro.getProperty("CallLogsDate");
			return CallLogsDate;
		}
		
		public String getPatName()
		{
			
			String PatName=pro.getProperty("PatientName");
			return PatName ;
		
		}
		
		public String getNewPatientFormURL() 
		{
		String NewPatientFormURL=pro.getProperty("NewPatientFormURL");
		return NewPatientFormURL;
		}
		
		public String getPatientRegistrationFormURL() 
		{
		String PatientRegistrationFormURL=pro.getProperty("PatientRegistrationFormURL");
		return PatientRegistrationFormURL;
		}
		
		public String getOnlineAppURLClincMV() 
		{
		String OnlineAppURLClincMV=pro.getProperty("OnlineAppURLClincMV");
		return OnlineAppURLClincMV;
		}
		
		public String OnlineAppURLClincMVLoginURL() 
		{
		String OnlineAppURLClincMVLoginURL=pro.getProperty("OnlineAppURLClincMVLoginURL");
		return OnlineAppURLClincMVLoginURL;
		}
		

		public String getEmailOrNumber() {
			String EmailOrNumber=pro.getProperty("EmailOrNumber");
			return EmailOrNumber;
		}
		
		public String getCVV() 
		{
			String CVV=pro.getProperty("CVV");
			return CVV;
		}
		public String getCardNumber() 
		{
			String CardNumber =pro.getProperty("CardNumber");
			return CardNumber;
		}
		public String getExpDate() 
		{
			String ExpDate =pro.getProperty("ExpDate");
			return ExpDate;
		}
		
		
		//OnlineAppURLClincMV
		

		
		
		
		
}
		


	

