package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionmoveto {

public static void main(String[] args)	throws InterruptedException
{
	//step1 lanuch the browser
	WebDriver driver = new ChromeDriver();
	
	//step2 maximixe the window
			driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");	
	driver.findElement(By.xpath("//button[.='✕']")).click();//driver.findElement(By.class(""));
	//selecting the electronics menu		
		WebElement	element =driver.findElement(By.xpath("//div[.='Electronics']"));
		Actions act = new Actions(driver); //driver = selenium.interaction package
		
		//call the reference (act.Mov(WebElementaction)), .act is a void 
act.moveToElement(element).perform();
System.out.println("mouse moving to electronics");

//selecting the electronics menu and inbulid select gaming 
WebElement	element1 =driver.findElement(By.xpath("//a[.='Gaming']"));
Actions act1 = new Actions(driver); //driver = selenium.interaction package

//call the reference (act.Mov(WebElementaction)), .act is a void 
act1.moveToElement(element1).perform();
System.out.println("mouse moving to electronics");
}}
