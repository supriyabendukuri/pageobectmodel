package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class linksfb {
  @Test
  public void links1() {
	  WebDriver dr= new FirefoxDriver();
	  dr.get("https://www.facebook.com");
	  List<WebElement> links= dr.findElements(By.tagName("a"));
	  int linkcount=links.size();
	  System.out.println(linkcount);
	  for (int i = 1; i <links.size(); i=i+1) {
		System.out.println(links.get(i).getText());
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("document.getElementById('email').value='Supriya';");
		js.executeScript("document.getElementById('email').value='Supriya';");
	}
	  
  }
}
