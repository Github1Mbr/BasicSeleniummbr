package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("email")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.name("pass")).sendKeys("raj");
	//name is locator email is a id and password is name is locator pass is a id in facebook
//we using the tagname input < > angular bracket in that name is id also a attribute of an element<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
	}
}