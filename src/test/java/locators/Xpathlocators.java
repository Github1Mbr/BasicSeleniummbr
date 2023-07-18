package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");		WebDriver driver=new ChromeDriver(); 
		Thread.sleep(1000);
		driver.get("https://www.instagram.com/"); 
	    Thread.sleep(7000);
	     
	    // Xpath by using Unique attribute
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	   Thread.sleep(2000);
	   
	
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		Thread.sleep(4000);
		
		//Xpath by using text()
		// driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}
}
