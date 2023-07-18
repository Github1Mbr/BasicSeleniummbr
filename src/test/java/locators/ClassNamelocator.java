package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNamelocator {
	public static void main(String[] args)
			throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(4000);
	driver.findElement(By.className("_aa48")).sendKeys("admin");

	//<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
	//in input class nad before tagname the both the class name are same so the output is error
	}
	
}
