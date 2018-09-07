package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationBuilder {

	public static void main(String[] args) throws InterruptedException, AWTException {
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

		driver.navigate().to("https://qm2.bifreedom.com/v4.5/modeler");

		driver.findElementByXPath("//ul[@id='Freedom DBroot']/li/span").click();

		Thread.sleep(5000);


		driver.findElementByXPath("//ul[@id='Freedom DB2']/li/span").click();

		WebElement  click = 	 driver.findElementByXPath("//ul[@id='Freedom DB3']/li/label");

		Actions action= new Actions(driver);
		action.contextClick(click).build().perform();

		driver.findElementByLinkText("Alter Table").click();

		Thread.sleep(5000);

		


		WebElement tb = 	driver.findElementByXPath("//div[@id='cA1']//div//table/tr/td");

		Actions actions1 = new Actions(driver);
		actions1.moveToElement(tb);
		actions1.click();
		
		actions1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions1.sendKeys(Keys.BACK_SPACE);
		actions1.sendKeys("aaaa");
		actions1.build().perform();
		
		WebElement tb1 = 	driver.findElementByXPath("//div[@id='cA1']//div//table/tr/td[2]");

		Actions actions11 = new Actions(driver);
		actions11.moveToElement(tb1);
		actions11.click();
		
		/*actions11.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions11.sendKeys(Keys.BACK_SPACE);*/
		actions11.sendKeys("varchar");
		actions11.build().perform();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id='cA1']//div/input[3]").click();
		
		//driver.findElementByXPath("//div[@id='cA1']//div//table/tr/td").sendKeys(Keys.DELETE);
		//driver.findElementByXPath("//div[@id='cA1']//div//table/tr/td").sendKeys("aaa");



		//*[@id="cA1"]/div/div[1]/div[1]/table/tr[1]/td[1]

		//*[@id="cA1"]/div/div[1]/div[1]/table/tr[1]/td[1]

		//action.moveToElement(click).contextClick(click).click().perform();
		/*WebDriverWait wait = new WebDriverWait(driver,20);

		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me"))); */


	}

}
