package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import  org.openqa.selenium.support.ui.Select;
public class Loginpage 
{
	WebDriver dr;
	 public Loginpage(WebDriver obj) {
		 this.dr=obj;
	 }

	 @FindBy(name="email")
	 WebElement email;
	 
	 @FindBy(name="pass")
	 WebElement password;
	 
	 @FindBy(xpath="//*[@id=\"loginbutton\"]")
	 WebElement  login;
	 
	 @FindBy(xpath="//*[@role='alert']")
	 WebElement alert;
	 
	 @FindBy(xpath="//*[@id=\"day\"]")
	 WebElement date;
	 
	 public void emailid(String emid)
	 {
		 email.sendKeys(emid);
	 }
	 public void password(String pwd)
	 {
		 password.sendKeys(pwd);
		 
	 }
	 public void click()
	 {
		 login.click();
	 }
	 public void alertmsg() {
		String s= alert.getText();
		 System.out.println(s);
	 }
	 public void navigate() {
		 dr.navigate().back();
		 dr.navigate().back();
	 }
	 public String loginpagetitle() {
		return dr.getTitle();
	 }
	  public void dateof() {
		  
		Select s= new Select(date);
		s.selectByVisibleText("10");
		String s1=date.getText();
		System.out.println(s1);
		  
		  
	  }
}
