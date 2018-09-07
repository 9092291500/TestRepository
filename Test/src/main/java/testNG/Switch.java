package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Switch {

	WebDriver driver1;


	public void setup(String browser , String url) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
			System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
			driver1 = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			//create chrome instance
			driver1 = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("Edge")){
			//set path to Edge.exe
			System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
			//create Edge instance
			driver1 = new EdgeDriver();
		}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		
		
		driver1.get(url);

	}

}
