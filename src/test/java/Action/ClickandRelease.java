package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandRelease {
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://demoqa.com/buttons");	

		//click and Hold operation
		WebElement hold=driver.findElement(By.xpath("//button[.='Click Me']"));
		
		//Actions class
		Actions act = new Actions(driver);
		act.clickAndHold(hold).perform();  
		System.out.println("Click and hold");
	
		Thread.sleep(4000);
	
		//Release
		
	act.release(hold).perform();
	System.out.println("Release");
		
	}
} 