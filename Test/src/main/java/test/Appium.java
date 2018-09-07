package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");	
		ChromeDriver chdriver = new ChromeDriver();
		 */




		DesiredCapabilities cap = new DesiredCapabilities();
		File file = new File(System.getProperty("user.dir"));
		File app = new File(file, "/app/app.apk");
		cap.setCapability(MobileCapabilityType.APP,app);
		cap.setCapability("deviceName", "65e7aa52"); 
		cap.setCapability("PlatformName", "Android");
		cap.setCapability("PlatformVersion", "6.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.2");
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("newCommandTimeout", "6000");
		cap.setCapability("recreateChromeDriverSessions",true);
		cap.setCapability("appPackage", "com.appsfreedom.quality");
		cap.setCapability("appActivity", "com.appsfreedom.quality.appsFreedom");
		//cap.setCapability("autoAcceptAlerts",true);
		cap.setCapability("autoLaunch", true);
		AndroidDriver  driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		//Determine the implicit wait for each command from the script
		driver.manage().timeouts().implicitlyWait(140, TimeUnit.SECONDS);
		Thread.sleep(10000);
		Set<String> contexts = driver.getContextHandles();
		for (String scontext : contexts) {
			System.out.println(scontext); //it will print the list of contexts like
			if (scontext.contains("WEBVIEW")){
				System.out.println("Switching App Context to webview..");
				driver.context(scontext);
				Thread.sleep(15000);
				System.out.println("Switching App Context to webview Success.");
				break;
			}
		}

		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElementById("username").sendKeys("admin");

		driver.findElementById("password").sendKeys("afQA!@34");
		driver.findElementById("login_button").click();



	}

}
