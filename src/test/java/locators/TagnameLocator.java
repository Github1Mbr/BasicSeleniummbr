package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator {

	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	//driver.findElement(By.tagName("input")).sendKeys("admin");
	//we need to get webelement its accpect chart,Strings
	//its have more number of inputs tag name so the locator will confuse and its not run and its show the error
	driver.findElement(By.tagName("button")).click();
	
	//by.tagname(String) is method which accpect tagname we are calling a class in BY we need give a tag is input(its a arugument also)
	}
}
