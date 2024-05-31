package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class contactsTest {
	WebDriver driver;
	
	@Test
	
	public void createContact()
	
	{
		String BROWSER = System.getProperty("browswr","chrome");
		if(BROWSER.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		else
		{
			 driver = new FirefoxDriver();
			
		}
		
		
		System.out.println("execute createContact");
	}
	
   @Test
	
	public void modifyContact()
	{
		System.out.println("execute modifyContact");
	}

}
