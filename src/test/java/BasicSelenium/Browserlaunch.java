package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch {
	public static void main(String[] args)
	{
	//To lunch the Chrome browser
	ChromeDriver driver=new ChromeDriver();
	System.out.println("Lunched Browser");
	//To lunch the firefox browser
	FirefoxDriver driver1=new FirefoxDriver();
	System.out.println("Lunched Browser");
	//To lunch the edge browser
	System.out.println("Lunched Browser");
	//upcast the chromeDriver to web driver interface
	//we need to change the browser we need use the interface 
	WebDriver driver2 =  new ChromeDriver();
	//we always work with interfaces and webdrivers 
	System.out.println("Lunched Browser ended");
	
	}
}
