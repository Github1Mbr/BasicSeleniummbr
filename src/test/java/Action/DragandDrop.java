package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");	
	
		//we need to drag and drop
		WebElement captial = driver.findElement(By.id("box3"));
		WebElement country =driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(captial, country).perform();
		Thread.sleep(2000);
		System.out.println("Matching the correct one");
		
		
	}

	
}
