package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_browser {
	
	 public static void main(String[] args) {
		 
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Launch the web driver and navigate to a website
	        driver.get("www.google.com");

	        // Perform any actions or assertions on the web page
	        // ...

	        // Close the web driver
	        driver.quit();
	    }
	}
