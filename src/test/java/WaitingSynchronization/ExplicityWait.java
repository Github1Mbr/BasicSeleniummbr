
package WaitingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {
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
		driver.findElement(By.name("user_password")).sendKeys("manager");

		// Step 6: Click on Login Button
		driver.findElement(By.id("submitButton")).click();
		
		//Step 7: Wait until the home page title is visible
		WebElement ele = driver.findElement(By.linkText("Organizations"));
		//Syntax = 1
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//class is WebDriverWait(Duration timeour,org.op.suport),driver,duration.ofsecond(),forexcliplicity wait we need to use webdriverwait
		//it will given time is not enfoe for that it show the timeout exceptions
		// if in the time duration if its not satisified it will give no such element or timeout exectption                                                                                                                                          
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Organizations")));
		//wait.until(null)-null we need give condition in the bracket in the attribute more the option likeby.locators
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		//according to the requirement we can use the objects 
		//Syntax = 2
		wait.until(ExpectedConditions.titleContains("Home"));//we need to give the condition in this places its have more objects creations it having only 2 methods that are used in widely like visiblityOfWebElement and ElementTobeClickable is common methods	
		//home it will to take home page spose it will not take home page means 
		//if the condition is satified it will go to next element if the condition is not satified it return to tieout and t will check again untill the process end
		//in explicity method it will reduce the most of the errors
		System.out.println("Title contains Home");
		
		
		
		
		

	}
	

}
