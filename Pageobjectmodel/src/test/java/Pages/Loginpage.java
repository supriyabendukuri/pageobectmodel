package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
