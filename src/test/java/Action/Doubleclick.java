package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://demoapp.skillrary.com/product.php?product=java");	
	
		WebElement add = driver.findElement(By.id("add"));
		WebElement sub =driver.findElement(By.id("minus"));
		
		Actions act = new Actions(driver);
		act.doubleClick(add).perform();
		System.out.println("Add is done");
		Thread.sleep(2000);
		
	Actions act1 = new Actions(driver);
	act.doubleClick(sub).perform();
	System.out.println("Sub is done");
	}
}
