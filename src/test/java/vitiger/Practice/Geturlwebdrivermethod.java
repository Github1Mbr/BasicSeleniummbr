package vitiger.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturlwebdrivermethod 
{
	
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\Desktop\\\\Java selinem\\\\Selinumproject\\\\drivers\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(4000);
driver.get("https://www.amazon.com/");
Thread.sleep(4000);
String url = driver.getCurrentUrl();
System.out.println(url);

}
}
