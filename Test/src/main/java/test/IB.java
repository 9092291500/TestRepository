package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IB {

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

  driver.navigate().to("https://qm2.bifreedom.com/v4.5/fb/builder.html");

  Thread.sleep(5000);

  driver.findElementByXPath("//div[@class='toolbox']//div//ul//li[2]/a").click();


  driver.findElementByXPath("//div[@id='afreedomdb']").click();
  Thread.sleep(5000);
  WebElement From = driver.findElement(By.id("imgSQL-Select"));
  WebElement parnt = driver.findElement(By.id("collapseafreedomdb"));
  //WebElement From = driver.findElement(By.xpath("//img[@src='images/db.png']"));
  WebElement to = driver.findElementById("drop");
   Actions actionBuilder=new Actions(driver);
  
   //actionBuilder.dragAndDrop(From, to);
   //String js="arguments[0].style.height='auto';arguments[0].style.visibility='visible';";
   //((JavascriptExecutor)driver).executeScript(js, parnt);
   //((JavascriptExecutor)driver).executeScript("arguments[0].click()", From);
   //Thread.sleep(5000);
   //From.click();
   /*actionBuilder.build();
   actionBuilder.dragAndDropBy(to, 300,300).perform();
   actionBuilder.release();*/
  actionBuilder.clickAndHold(From).dragAndDrop(From, to).perform();;
  String js="arguments[0].style.zIndex='1000';";
  ((JavascriptExecutor)driver).executeScript(js, to);
 
  /* .moveToElement(to, 500, 500).perform();
  Thread.sleep(2000);
   actionBuilder.release(to).build().perform();*/
  
/* Actions actions1 = new Actions(driver);
	actions1.moveToElement(From);
	actions1.click();
  //From.click();
  WebElement  to =  driver.findElementById("canvas");
  actions1.moveToElement(to);
	actions1.click();
  //JavascriptExecutor js = (JavascriptExecutor)driver;
  //js.executeScript("var c = document.getElementById('myCanvas')");
  var ctx = c.getContext("2d");
  ctx.fillStyle = "red";
  ctx.fillRect(10, 10, 50, 50);
	  Thread.sleep(10000);
  
  Actions actionBuilder=new Actions(driver);          
  actionBuilder.clickAndHold(From)
                  //.moveByOffset(260, 180)
                  .release(to)
                  .build().perform();
   actionBuilder.moveToElement(From,223, 184)
   .clickAndHold(From)
   .moveToElement(to)
   .moveToElement(to,326, 277)
   .release(From)
   .build().perform();*/
 
   System.out.println("Done");
  /*Actions builder= new Actions(driver);

  WebElement From = driver.findElementByXPath("//div[@id='collapseafreedomdb']//div/p");


  WebElement  to =  driver.findElementById("canvas");


  Point point = to.getLocation();

  int xcord = point.getX();
  int ycord = point.getY();
  System.out.println(xcord );

  System.out.println(ycord);
   Robot robot = new Robot ();
      
      robot.mousePress(InputEvent.BUTTON1_MASK);
      robot.mouseMove(250, 102);
      robot.mouseRelease(InputEvent.BUTTON1_MASK);*/


  /*WebElement to = driver.findElementByClassName("upper-canvas");*/


  //builder.dragAndDropBy(From, xcord, ycord).build().perform();


  /*Actions actions = new Actions(driver);
     actions.moveToElement(paletteCanvas, palette_node_x, palette_node_y);
     actions.clickAndHold();
     //Dragg*/
  
 }}
  
  
  
  
