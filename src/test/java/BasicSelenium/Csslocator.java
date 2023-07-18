package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {
	public static void main(String[] args)throws InterruptedException
	{//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().minimize();
	
	//Step 3 : Load the URL demo Vtiger App
	driver.get("https://demo.actitime.com/login.do");
	 
	//Step 4 : Identify username in Demo Vtiger
	//driver.findelement()-use for identy interface to webelement(Action) interfaces
	//we indentify the element using the find elements we need to execte for that we using webdriver 
	WebElement usernameEle=driver.findElement(By.cssSelector("input[type='text']"));
	//Perform action on the web element identified  
	usernameEle.sendKeys("admin"); 
	//Step 5 : Identify password indemo vitger
//	WebElement passordEle=driver.findElement(By.name("pwd"));
	//Perform action on the web element identified  
	//passordEle.sendKeys("manager");		
	
	//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");	
	//another method . is consider as class
	driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager"); // . means consider as class only for css
	//Step 6 : Click on organization link in the id = Css
	//driver.findElement(By.cssSelector("[id=loginButton']")).click();
	//another method # is consider as id
	driver.findElement(By.cssSelector("#loginButton")).click();
	} 


}
