package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripD_ID {
	public static void main(String[] args) 
			throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");		WebDriver driver=new ChromeDriver(); 
		Thread.sleep(1000);
		driver.get("https://www.redbus.in/"); 
	    Thread.sleep(7000);
	    driver.findElement(By.id("onward_cal")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//td[text()='20']")).click();
}
}