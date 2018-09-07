package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {


	@Test
	public void invoke() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.quit();



	}

}
