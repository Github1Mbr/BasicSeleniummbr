package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchandcapturephoneflipkart {
	public static void main(String[] args)throws InterruptedException
	{		
	//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().minimize();
	
	//Step 3 : Load the URL demo Vtiger App
	driver.get("https://www.flipkart.com/");
Thread.sleep(3000); 
//Step 4 : its used to close the autogeneration of login user
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

//Step 5 : search for redmi phones
driver.findElement(By.name("q")).sendKeys("redmi");
driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

//Step 5 : Capture all the phones
List<WebElement> list=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
for(WebElement element : list)
{
	String Phone = element.getText();
	System.out.println(Phone);
	
	}
}

}
