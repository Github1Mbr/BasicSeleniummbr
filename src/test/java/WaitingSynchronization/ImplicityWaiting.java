package WaitingSynchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaiting 
{
	public static void main(String[] args) 
	{

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();
		
		//Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//there are 2 ways to use in implicity wait in that 
		//driver,manage()-options nested interface of chaining operation-webdriver
		//timeout()- timeout option interface
		//implicity wait - implicity wait(duration,duration) - time out and implicity []longtime,timeout uint we are using selenium 4 this implicity [timeout,timeout unit]this method is removed so we need to use only only duration we use this for 10 long seconds
		//what timing we are mention for that timing only checking process will start and execute
		//we need use the implicity statement before the/ webpage or driver.get()
		//in this it will check all the steps regarding one by one incase the checking process is finished in 3 seconds it will move to nedt element
		// this method will is best ways of checking the elements
	//we can use only for statement also like organizationp,
		//only the element identification is not done in implicity and only the element identification is failed it will stop the checking and  we need to keep that type of statements in before the programs
		//it will take lookupimage or dosuments it will take little bit time to execute for that we need to copy the statement and paste in stating point of that programs it will neglate the  statment and run the programs
		//after the pollling times it still checking fot that we need to increase the tinings
		
		// Step 3: Load the URL - Demo Vtiger App
		driver.get("http://localhost:8888");
		//we given implicty statement here means it will work only for uRL for use all the elements we need to mention in before the url 
		//we will given before the webpage address it will appply for all the elements links findelements,findelement and drivers drivers.get() for through out the programs means full the programs
		//we used the implicity statement here menas it will only work for driver.elements
		//all the elements and locators we aneed to identify and used in implicity and most of the program major issues solved in implicity waits for exmple;- no suchelement,nofield 
		// Step 4: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		// Step 5: identify UserName in Demo Vtiger and provide the data
		driver.findElement(By.name("user_password")).sendKeys("manager");
		
		// Step 6: Click on Login Button
		driver.findElement(By.id("submitButton")).click();
//for every 10 seconds will check the executions
		// Step 7: click on Organizations Link
		driver.findElement(By.linkText("Organizations")).click();

		// Step 8:Identify all the organization names
		List<WebElement> list = driver.findElements(By.xpath("//a[@title='Organizations']"));

		// Step 9: capture all the org Names and print in console
		for (WebElement ele : list) {
			String value = ele.getText();
			System.out.println(value);
		}

	}
}