package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {

	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	
		//context click
		WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
		
		WebElement edit =driver.findElement(By.xpath("//span[.='Edit']"));
		
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(2000);
		System.out.println("accessing the right click");
		
		
	}

}
