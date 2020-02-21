package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Registerpage;

public class RegisterTest extends TestBase {
	
  @Test
  public void Register() 
  {
	  Registerpage regpage=PageFactory.initElements(driver, Registerpage.class);
	  regpage.firstname("Supriya");
		  
	  }
  }

