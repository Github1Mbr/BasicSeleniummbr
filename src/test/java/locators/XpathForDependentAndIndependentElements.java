package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForDependentAndIndependentElements {

	public static void main(String[] args) 
			throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");		WebDriver driver=new ChromeDriver(); 
		Thread.sleep(1000);
		driver.get("https://www.easemytrip.com/"); 
	    Thread.sleep(7000);
	    driver.findElement(By.id("ddate")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Apr 2023']/../..//li[text()='27']")).click();
}
	}
