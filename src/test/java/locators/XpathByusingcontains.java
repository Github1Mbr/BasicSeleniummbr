package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByusingcontains {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");		WebDriver driver=new ChromeDriver(); 
		Thread.sleep(1000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	    Thread.sleep(7000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,' Login ')]")).click();

}
}