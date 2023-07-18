package JavascriptScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectDropdown {
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println("hi1");

		//step 4 locate a dropdown
		WebElement singleSelectdropdown=driver.findElement(By.id("oldSelectMenu"));
		
		//step 5 To handle the dropdown create object of selecting class
		Select sel = new Select(singleSelectdropdown);
		
		//step6 select option in side the dropdown - using index
		sel.selectByIndex(0);
		System.out.println("index o value ");
		Thread.sleep(2000);
		
		//step7 select option in side the dropdown - using value
		sel.selectByValue("7");
		System.out.println("value is 7  ");
		Thread.sleep(2000);
	
		//step8 select option in side the dropdown - using value
				sel.selectByVisibleText("Yellow");
				System.out.println("Yellow Colour is select ");
				Thread.sleep(2000);
		
	}


}
