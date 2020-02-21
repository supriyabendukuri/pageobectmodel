package links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ideaelanlinks {
	WebDriver dr; 
	@BeforeClass
	 public void initialize() {
		
		dr=new FirefoxDriver();
		  dr.manage().window().maximize();
		  dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  dr.get("http://dev.ideaelan.com/Version11/Public/AppLogin.aspx");
		  Reporter.log("application launched successfully", true);
	  }
	

	@Test
	  public void login() throws InterruptedException 
	  {
		  
		  dr.findElement(By.name("ctl00$loginUC$txtUsername")).sendKeys("superadmin@ideaelan.com");
		  Thread.sleep(3000);
		  dr.findElement(By.name("ctl00$loginUC$txtPassword")).sendKeys("Test@1234");
		  dr.findElement(By.id("ctl00_loginUC_btnLogin_input")).click();
		  Thread.sleep(3000);
		
		  dr.findElement(By.linkText("Super Admin")).click();
		  Reporter.log("Super Admin clicked successfully", true);
		  Thread.sleep(3000);
		 
		  boolean b=dr.findElement(By.linkText("Institutions")).isDisplayed();
		  if (b==true) {
			  dr.findElement(By.linkText("Institutions")).click();
		  }
		  Reporter.log("Institutions clicked successfully", true);
		  Thread.sleep(3000);
		  JavascriptExecutor js=(JavascriptExecutor)dr;
		  js.executeScript("scroll(0,4000)");
		 
		  dr.findElement(By.linkText("Facilities")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Facilities clicked successfully", true);
		  
		  dr.findElement(By.linkText("Departments")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Departments clicked successfully", true);
		  
		  dr.findElement(By.linkText("Labs")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Labs clicked successfully", true);
		  
		  dr.findElement(By.linkText("Users")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Users clicked successfully", true);
		  
		  dr.findElement(By.linkText("Invoices")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Invoices clicked successfully", true);
		  
		  dr.findElement(By.linkText("Reports")).click();
		  Thread.sleep(4000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Reports clicked successfully", true);
		  
		  dr.findElement(By.linkText("Site Configuration")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Site Configuration clicked successfully", true);
		  
		  dr.findElement(By.linkText("Repository Templates")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Repository Templates clicked successfully", true);
		  
		  dr.findElement(By.linkText("Zeiss Settings")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Zeiss Settings clicked successfully", true);
		  
		  dr.findElement(By.linkText("Login")).click();
		  Thread.sleep(2000);
		  js.executeScript("scroll(0,4000)");
		  Thread.sleep(3000);
		  js.executeScript("scroll(0,-4000)");
		  Reporter.log("Login clicked successfully", true);
	  }
	
@Test
public void getalllinks() 
{
	 List<WebElement> links= dr.findElements(By.tagName("a"));
	  int linkcount=links.size();
	  System.out.println(linkcount);
	  for (int i = 1; i <links.size(); i=i+1) {
		System.out.println(links.get(i).getText());
	}
	
}


@AfterClass
public void close() 
{
	
	//dr.quit();
	 Reporter.log("application closed successfully", true);
}
}











