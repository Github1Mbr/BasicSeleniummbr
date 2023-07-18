package vitiger.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcewebdrivermethod {
	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/");//two browser launch
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");//one only output 
		Thread.sleep(5000);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}
