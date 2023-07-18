package JavascriptScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolluntilElementref {

	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement clickon=driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		System.out.println("hi1");
		WebElement scrolluntil=driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		System.out.println("hi2");
		Thread.sleep(2000);
		
		//scroll untill the element refence
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].();",scrolluntil);
		//or
		js.executeScript("arguments[0].click()",scrolluntil);
		System.out.println("hi3");
		
		Thread.sleep(2000);
		clickon.click();
		System.out.println("hi4");
	}
}
