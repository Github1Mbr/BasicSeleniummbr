 package JavascriptScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingScrollby {

	public static void main(String[] args)	
			throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement clickon=driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		System.out.println("hi1");
		WebElement scrollUntil=driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		System.out.println("hi2");
		
		//y axis value we need to enter in the windows.scrollby options 
		int yAxis = scrollUntil.getRect().getY();
		
		
		//scroll untill the element refence
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//we cannot put directly yaxis because the formate in string its gos concodinate process
		 
		js.executeScript("window.scollBy(0,"+yAxis+");",scrollUntil);
			System.out.println("hi3");
		
		clickon.click();
		System.out.println("hi4");
	}


}
