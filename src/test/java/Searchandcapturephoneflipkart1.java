import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchandcapturephoneflipkart1 {
	public static void main(String[] args)throws InterruptedException
	{		
	//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().maximize();
	
	//Step 3 : Load the URL demo Vtiger App
	driver.get("https://www.amazon.in/");
Thread.sleep(3000); 

//Step 4 : Search for redmi phones
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");	
driver.findElement(By.id("nav-search-submit-button")).click();

//Step 5 : Capture all the phones
List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for(WebElement element : list)
{
	String Phone = element.getText();
	System.out.println(Phone);
	
	}
	}

}
