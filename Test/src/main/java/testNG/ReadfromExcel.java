package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class ReadfromExcel {

	@Test
	public void tc01() throws IOException, InterruptedException{

		String path = "C:\\Users\\HP\\Desktop\\New folder\\TestData.xlsx";
		
	//	"C:\\Users\\kudaya\\Desktop\\Artifacts\\TestData.xlsx";


		FileInputStream inputStream = new FileInputStream(path);
		@SuppressWarnings("resource")
		XSSFWorkbook Wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet1 = Wb.getSheetAt(0);

		int rowCount = sheet1.getLastRowNum();
		System.out.println("Total No of Rows   " +rowCount);


	/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\ChromeDriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();*/


		for(int i = 1; i<=rowCount; i++){

			for(int j =1; j<=rowCount; j++){
				
				for(int t =1; t<=rowCount; t++){
				
				DataFormatter formatter = new DataFormatter();
				
				//formatter.formatCellValue(sheet.getRow(row).getCell(col));

				//XSSFRow row1 = sheet1.getRow(i);
				String username = formatter.formatCellValue(sheet1.getRow(i).getCell(0));
						//row1.getCell(0).getStringCellValue();
				
				


				
				String password = formatter.formatCellValue(sheet1.getRow(j).getCell(1));
				
				String tenid = formatter.formatCellValue(sheet1.getRow(t).getCell(2));


				/*XSSFRow row2 = sheet1.getRow(j);
				String password = row2.getCell(1).getStringCellValue();*/
				
				System.out.println(username + "    "+ password + " "+ tenid );
				
				
				  /*driver.get("https://qm2.bifreedom.com/");
				  
				  Thread.sleep(5000);
				  driver.findElementById("userId").sendKeys(username);
				  driver.findElementById("password").sendKeys(password);

				  driver.findElementById("tenantId").sendKeys(tenid);



				  Select osel = new Select(driver.findElementById("landscape"));
				  osel.selectByVisibleText("Development");

				  driver.findElementByClassName("signIn-button").click();*/

				/*driver.get("https://testhostname.on.softools.net/Account/Login?ReturnUrl=%2F");
				driver.findElementById("Username").sendKeys(username);
				driver.findElementById("Password").sendKeys(password);

				driver.findElementByXPath(".//*[@id='loginForm']/fieldset/section/div/button").click();*/

				//driver.quit();




			}}
		}}}