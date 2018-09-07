package testNG;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider="fetchdata")
	public void audible(String cat ) { 
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.audible.com/ref=a_series_tloft__galileo?ie=UTF8&pf_rd_r=055ND63KVE61P0CW56EZ&pf_rd_m=A2ZO8JX97D5MN9&pf_rd_t=101&pf_rd_i=series-detail&pf_rd_p=2452660142&pf_rd_s=top-logo-ftx");

		driver.findElementById("ftx_topnav_search").sendKeys(cat);
		Actions action = new Actions(driver); 
		action.sendKeys(Keys.ENTER).build().perform();
		driver.findElementByXPath("//a[@class='adbl-link']").click();
		String d = driver.findElementByXPath(".//*[@id='center_2']/div[2]/div[2]/div[2]/div[1]/ul/li[1]/span[2]").getText();
		System.out.println(d);
		String Title = driver.findElementByXPath(".//*[@id='center_2']/div[2]/div[2]/div[2]/h1").getText();
		System.out.println(Title);



		//	Titile

		String Title1 = driver.findElementByClassName("adbl-prod-h1-title").getText();
		System.out.println("Title1");

		String Genre = driver.findElementByXPath(".//*[@id='center_2']/div[2]/div[1]/div[2]/a/span").getText();
		String Genre1 = driver.findElementByXPath(".//*[@id='center_2']/div[2]/div[1]/div[3]/a/span").getText();
		System.out.println(Genre+ Genre1);
		String NEWX = driver.findElementByXPath("(//a[@class='adbl-link'])[2]").getText();
		String NEWX1 = driver.findElementByXPath("(//a[@class='adbl-link'])[3]").getText();

		driver.quit();

	}
	@DataProvider(name = "fetchdata")
	public Object[][] getdata() {
		Object [][] testdata = new Object[5][1] ; 

		testdata[0][0] = "BK_ADBL_023718"; 
		testdata[1][0] =  "BK_PENG_000955"; 
		testdata[2][0] = "BK_PENG_000956";
		testdata[3][0] = "BK_SANS_001749"; //two authors
		testdata[4][0] = "BK_HACH_000245";  //  two authors 


		return testdata ; 
	}


}
