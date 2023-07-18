package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovebyOffsetmethod3 
{
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		Thread.sleep(5000);
		//	driver.findElement(By.xpath("//button[.='✕']")).click();//driver.findElement(By.class(""));

		//move by offset value x,y in webpage in webdriver method 
		Actions act = new Actions(driver); //driver = selenium.interaction package
		
		//click on the webpage in webdriver in anywhere of the pages
		//call the reference (act.Mov(WebElementaction)), .act is a void 
act.moveByOffset(20,20).click().perform();
System.out.println("mouse moveByoffset");
		 
		//selecting the electronics menu		
			WebElement	element =driver.findElement(By.xpath("//div[.='Electronics']"));
			Actions sel = new Actions(driver); //driver = selenium.interaction package
			
			//call the reference (act.Mov(WebElementaction)), .act is a void 
	act.moveToElement(element).perform();
	System.out.println("mouse moving to electronics");

	}}

	

