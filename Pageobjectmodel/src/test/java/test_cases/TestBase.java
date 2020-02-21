package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase 
{
	WebDriver driver;
  @BeforeSuite
  
 
  public void initialize() 
  {
	 //System.setProperty("webdriver.chrome.driver","D:\\pom\\Pageobjectmodel\\chromedriver.exe");
	 //driver=new ChromeDriver();	 
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
  }
  
  
 @AfterSuite
 public void  close() throws InterruptedException
 {
	 Thread.sleep(5000);
	//driver.quit();
	 
 }
 
}
