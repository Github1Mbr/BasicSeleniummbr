package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {
public static void main(String[] args)throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("bhuvi");
	//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
	//<div class="_6luy _55r1 _1kbt" id="passContainer"><input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password"><div class="_9ls7 hidden_elem" id="u_0_3_kG"><a href="#" role="button"><div class="_9lsa"><div class="_9lsb" id="u_0_4_jB"></div></div></a></div></div>	
}
}