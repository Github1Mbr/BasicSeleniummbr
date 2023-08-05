package WaitingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {
	
	public static void main(String[] args) {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");

		// Step 4: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_name")).sendKeys("admin");

		// Step 5: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_password")).sendKeys("admin");

		// Step 6: Click on Login Button
		driver.findElement(By.id("submitButton")).click();
		
		
		//Fluent Wait syntax
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(200));//this option present in the fluent menthod only
		//wait.pollingEvery(Duration Interval),duration-java.op,.ofmillis(200) - this is 2s
		wait.withTimeout(Duration.ofSeconds(5));
		//explicity method - (Duration.ofSeconds(5)
		wait.ignoring(NoAlertPresentException.class);
		//ignoring - class exception type,NoAlertPresentException.class - class,  
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.urlContains("Homeles"));
		System.out.println("polling every 200ms to wait for the URL");	
	}
}
