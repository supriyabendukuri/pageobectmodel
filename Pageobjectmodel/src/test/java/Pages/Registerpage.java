package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage 
{
	WebDriver dr;
public Registerpage(WebDriver obj) {
	this.dr=obj;
}
@FindBy(name="firstname")
WebElement lname;

public void firstname(String fnm) {
	lname.sendKeys(fnm);
}
}
