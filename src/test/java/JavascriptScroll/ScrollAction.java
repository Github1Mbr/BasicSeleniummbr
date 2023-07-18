package JavascriptScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class ScrollAction {
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println("hi1");
		//scroll down action
		JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
		System.out.println("hi2");
		Thread.sleep(3000);
		
		//scroll up action
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(4000);
		System.out.println("hi3");
		//scroll right action
		js.executeScript("window.scrollBy(200,0)");
		System.out.println("hi4");		
		Thread.sleep(4000);
		
		//scroll left action
		js.executeScript("window.scrollBy(-200,0)");
		System.out.println("hi5");
		Thread.sleep(4000);
				
			}

}
