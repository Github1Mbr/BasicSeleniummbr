package vitiger.Practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWebdrivermethod {
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\Desktop\\\\Java selinem\\\\Selinumproject\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	}	

}
