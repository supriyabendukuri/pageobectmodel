package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Loginpage;
import junit.framework.Assert;

public class LoginTest extends TestBase {
	
  @Test
  public void login() throws InterruptedException 
  {
	  
	  Loginpage logpage= PageFactory.initElements(driver, Loginpage.class);
	  String title = logpage.loginpagetitle();
	  Assert.assertEquals(title, "Facebook – log in or sign up");
	  System.out.println(title);
	  logpage.emailid("7288909440");
	  logpage.password("gyuppu43");
	  logpage.click();
	  logpage.alertmsg();
	  Thread.sleep(3000);
	  logpage.navigate();
	  logpage.dateof();	
 
  }
}
