package vitiger.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationbackfrowardrefreshwebdrivermethod
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\Desktop\\\\Java selinem\\\\Selinumproject\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
	}

}
