package JavascriptScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginusingjavscript {
	public static void main(String[] args) throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("http://localhost:8888/");
		
		WebElement un=driver.findElement(By.name("user_name"));
		System.out.println("hi1");
		WebElement pwd=driver.findElement(By.name("user_password"));
		System.out.println("hi2");
		WebElement submitbutton=driver.findElement(By.id("submitButton"));
		System.out.println("hi3");
		
		
		
		//scroll untill the element refence
		JavascriptExecutor js= (JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='admin'",un);
		js.executeScript("arguments[0].value='admin'",pwd);
		js.executeScript("arguments[0].click()",submitbutton);
		System.out.println("hi4");
	
		//get the title of the page 
		String title = driver.getTitle();
		System.out.println("Page Title is"+ title);

	}

}
