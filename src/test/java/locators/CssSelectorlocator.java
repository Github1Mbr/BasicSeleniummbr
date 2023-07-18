package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorlocator 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // Launch an empty browser.
		Thread.sleep(1000);
		driver.get("https://www.instagram.com/");  
	    Thread.sleep(7000);
	    driver.findElement(By.cssSelector("input[name^='u']")).sendKeys("admin");
	    Thread.sleep(1000);
	  //<input aria-label="Phone number, username, or email" aria-required="true" autocapitalize="off" autocorrect="off" maxlength="75" class="_aa4b _add6 _ac4d" dir="" type="text" value="admin" name="username" aria-describedby="slfErrorAlert">
	    driver.findElement(By.cssSelector("input[name$='d']")).sendKeys("admin123");
	    Thread.sleep(1000);
	    ///html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/label/input
	    driver.findElement(By.cssSelector("button[class*='_acap _acas']")).click();
		///html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button

	}

}
