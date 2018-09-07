package testNG;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qm2.bifreedom.com/");
		driver.findElementById("userId").sendKeys("admin");
		driver.findElementById("password").sendKeys("afQA!@34");

		driver.findElementById("tenantId").sendKeys("wat110173");



		Select osel = new Select(driver.findElementById("landscape"));
		osel.selectByVisibleText("Development");

		driver.findElementByClassName("signIn-button").click();

		driver.switchTo().frame(0);
		Thread.sleep(50000);

		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'dev') or contains(@id, 'qa') or contains(@id, 'prd')]")));


		driver.findElementByXPath("//a[contains(text(),'Platform Configurator')]").click();
		Thread.sleep(50000);



		//driver.switchTo().defaultContent();

		//driver.switchTo().frame(0);
		Thread.sleep(5000);

		driver.findElementByXPath("//label[contains(text(),'Projects & Transports')]").click();

		//driver.findElementByClassName("icon-white icon-search").click();
		Thread.sleep(5000);

		driver.findElementByXPath("//div[@class='btn-group']/button/i").click();





		driver.findElementByXPath("//table[@id='projectsDisplayTable']//thead//tr//th/input").sendKeys("offline");

		//*[@id="projectsDisplayTable"]/tbody/tr[1]/td[1]/input

		driver.findElementByXPath("//table[@id='projectsDisplayTable']//tbody/tr[1]/td[1]/input").click();

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);
		driver.findElementByXPath("//div[@id='projectManagementGeneralInfo']//li//a[text()='Transport']").click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)", "");

		driver.findElementByXPath("//*[@id='projectsTransportDisplayTable']/tbody/tr[1]/td[7]/a[1]").click();
		String a = driver.findElementByXPath("//*[@id='app_publishing_modal']/div/div/div/p/span[1]").getText();
		
		System.out.println(a);

		/*String cnt = 	driver.findElementByXPath("//label[@id='projtranPageNumberString']").getText();
		java.util.List<String> list =  Arrays.asList(cnt.split(" ")); 		
		System.out.println(list.get(6));*/

		/*List<WebElement> lb=driver.findElements(By.xpath("//table[@id='projectsDisplayTable']"));
		for(int i=0;i<lb.size();i++){
			System.out.println(lb.get(i).getText());

			}*/
		
		List<WebElement> lb=driver.findElements(By.xpath("//table[@id='projectsDisplayTable']"));
		for(int i=0;i<lb.size();i++){
			System.out.println(lb.get(i).getText());

			}
	//	listview_1_button_2


		/*List<WebElement> lb=driver.findElements(By.className("accordion-toggle"));
		System.out.println(lb.size());
		for(int i=0;i<lb.size();i++){
			System.out.println(lb.get(i).getText());
			if(lb.get(i).getText().equals("Platform Configurator")){
				lb.get(i).click();
				break;
			}
		}*/

		/*WebDriverWait wait = new WebDriverWait(driver, 60); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Platform Configurator')]")));
		element.click();*/

		//driver.findElementByXPath("//*[@id='accordion']/div[6]/div[1]/a").click();




	}

}
