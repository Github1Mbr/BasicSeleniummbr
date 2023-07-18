package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandSendkeys {

	public static void main(String[] args)	throws InterruptedException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("http://localhost:8888/");	
	
		WebElement un = driver.findElement(By.name("user_name"));
		WebElement submit =driver.findElement(By.id("submitButton"));
		
		//SendKeys and click
//		Actions act = new Actions(driver);
	//	act.sendKeys(un, "admin").perform();//anywhere cursor point select
	// when use the tab it passing to nexttab using passingkeys class
		//SendKeys and click with keyclass for password and userid
		Actions act = new Actions(driver);
		act.sendKeys(un, "admin",Keys.TAB,"admin").perform();//anywhere cursor point select
	
		//Acces class click method
		act.click(submit).perform();
		// when use the tab it passing to nexttab using passing NEXT TAB IS keys class enter the password
	
		//driver.findElement(By.id("submitButton")).click();
	}
	}