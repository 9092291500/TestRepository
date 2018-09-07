package testNG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PCC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");	

		//system.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qm.mfgfreedom.com/");
		driver.findElementById("userId").sendKeys("admin");
		driver.findElementById("password").sendKeys("afQA!@34");

		driver.findElementById("tenantId").sendKeys("wat110173");



		Select osel = new Select(driver.findElementById("landscape"));
		osel.selectByVisibleText("Development");

		driver.findElementByClassName("signIn-button").click();

		driver.switchTo().frame(0);
		Thread.sleep(50000); 

		driver.findElementByXPath("//a[contains(text(), 'Platform Configurator')]").click();
		
		
		
		driver.findElementByXPath("//*[@id='configurator_tab_header']/li[2]/a/label").click();
		
		Thread.sleep(50000); 
		
		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();


		//driver.findElementByXPath("//*[@id='accordion']/div[1]/div[1]/a").click();


/*
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());

		System.out.println(tabs2);
		driver.switchTo().window(tabs2.get(1));

		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(tabs2.get(0));
System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());*/
		
	
		//To locate table.
    	WebElement mytable = driver.findElementByXPath("//table[@id= 'contactsTable']");
    	
    	//To locate rows of table. 
    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	
    	//To calculate no of rows In table.
    	int rows_count = rows_table.size(); 
    	
    	System.out.println("Total No.of Rows :"+rows_count);
    	
    	//Loop will execute till the last row of table.
    	for (int row = 0; row < rows_count; row++) {  
    		
    		//To locate columns(cells) of that specific row.
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    		
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	        
    	        if(celtext.contains("FirstNameTest")) {
    	        	
    	        	System.out.println("IM HERE");
    	        	WebElement element =	driver.findElementByXPath(" //*[@id='contactsTable']/tbody/tr["+ row +"]/td[10]/a[2]/img");
    	        	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	        	executor.executeScript("arguments[0].click();", element);
    	        	
    	        }
    	    }
    	    System.out.println("-------------------------------------------------- ");
    		
    		
    		
    	}
		
		
		
	}

}
