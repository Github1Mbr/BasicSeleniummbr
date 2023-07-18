package JavascriptScroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledisableElement {
	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("https://demoapp.skillrary.com/");
		
		//step4 Identify the disabled element
		
		WebElement disabledTextFieled=driver.findElement(By.xpath("//input[@class='form-control ui-autocomplete-input']"));
		System.out.println("hi1");
		
		//scroll untill the element refence
		JavascriptExecutor js =(JavascriptExecutor)driver;
		System.out.println("hi1.2");

		
		js.executeScript("arguments[0].value='Qspider'",disabledTextFieled);
		System.out.println("hi3");
		
		
	}

}
