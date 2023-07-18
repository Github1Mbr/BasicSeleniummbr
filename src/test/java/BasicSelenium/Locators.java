package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args)throws InterruptedException
	{//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().minimize();
	
	//Step 3 : Load the URL demo Vtiger App
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	 
	//Step 4 : Identify username in Demo Vtiger
	//driver.findelement()-use for identy interface to webelement(Action) interfaces
	//we indentify the element using the find elements we need to execte for that we using webdriver 
	WebElement usernameEle=driver.findElement(By.name("user_name"));
	//Perform action on the web element identified  
	usernameEle.sendKeys("admin"); 
	//Step 5 : Identify password indemo vitger
	WebElement passordEle=driver.findElement(By.name("user_password"));
	//Perform action on the web element identified  
	passordEle.sendKeys("admin"); 
	//Step 6 : Identify password indemo vitger
		WebElement loginEle=driver.findElement(By.id("submitButton"));
		//Perform action on the web element identified  
		loginEle.click(); 
     //Step 7 : Click on organization link in the home page
	driver.findElement(By.linkText("Contacts")).click();
	//Step 8 : Click on organization link in the partial home page
		driver.findElement(By.partialLinkText("Opportuni")).click();
		//Step 9 : Click on organization link in the Classname locator
				driver.findElement(By.className("tabSeperator")).click();
	} 
}