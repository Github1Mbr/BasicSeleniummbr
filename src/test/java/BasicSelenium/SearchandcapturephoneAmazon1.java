package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchandcapturephoneAmazon1 {
	public static void main(String[] args)throws InterruptedException
	{		
	//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().maximize();
	
	//Step 3 : Load the URL
	driver.get("https://www.amazon.in/");
Thread.sleep(3000); 

//Step 4 : Search for redmi phones
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
//using Key.control+shift we get key.enter 	
//driver.findElement(By.id("nav-search-submit-button")).click();

//Step 5 : Capture all the laptops
Thread.sleep(2000);
List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//this for and if loop its is used to select the perticular HP Laptop
//in this which select the hp and it opens the hp laptop details in new tabs
for(WebElement element : list)
{
	String laptopName = element.getText();
	if(laptopName.contains("HP")) // it will used to open in new tab
		{
		System.out.println(element.getText());
		element.click();
		break;
		}
	}
	}
}
