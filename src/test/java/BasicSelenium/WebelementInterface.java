package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementInterface {
	public static void main(String[] args)throws InterruptedException
	{//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().minimize();
	
	//Step 3 : Load the URL demo Vtiger App
	driver.get("https://demo.actitime.com/login.do");
	 
	//Step 4 : Webmethod element - SendKeys
	driver.findElement(By.className("textField")).sendKeys("admin");
	Thread.sleep(2000);
	
	//Step 5 : Webmethod element - clear()
		driver.findElement(By.className("textField")).clear();
		
	
	driver.findElement(By.className("textField")).sendKeys("admin");
	driver.findElement(By.className("pwd")).sendKeys("manager");
	
	//Step 6 : Webmethod element - click()
	driver.findElement(By.tagName("aloginButton")).click();
//Click - clear - sendkeys - Action elements
	
	//get methods 
	//Step 6 : Webmethod elements - getAttributes(String Attributes)
		String attribute = driver.findElement(By.id("loginButton")).getAttribute("id");
	System.out.println(attribute); // calling the Attribute elements
	//its Attribute value is present its output is Null

	String attribute1 = driver.findElement(By.id("loginButton")).getAttribute("abc");
	System.out.println(attribute); // calling the Attribute elements o/p is Null
	
		//Step 6 : Webmethod elements - getName()
			String tag = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(tag); // calling the Attribute elements
		
	
	
	}
}