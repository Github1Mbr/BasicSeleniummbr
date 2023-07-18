package BasicSelenium;

import java.awt.Window;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriveallfunctions {
public static void main(String[] args)throws InterruptedException	{
	//To lunch the Chrome browser
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Lunched Browser");
		//To Load Url
				driver.get("https://flipkart.com");
				System.out.println("Flipkart loaded");
		//Navigationbackfrowardrefreshwebdrivermethod
		Thread.sleep(4000);
		driver.navigate().to("https://flipkart.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		//To Load Url
		driver.get("https://flipkart.com");
		System.out.println("Flipkart loaded");
		//To Maximise the Browser
		//Options op = driver.manage();
		//Window win=op.window();
		//win.maximize();
		//Direct Method - Maximizes
		driver.manage().window().maximize();
		//Dimension targetSize = new Dimension(700,500);//we need to clear java import delete and come to new dimension we need to change the dimension in selenium
		//driver.manage().window().setSize(targetSize);
		 //Point TargetPostion = new Point(30,250);//first write new point after that type a targetposition select local variable and come to point and select selenium
		 //driver.manage().window().setPosition(targetpoistion);

		//To Capture the page title
		String title = driver.getTitle();
		System.out.println("Page Title is"+ title);
		//To Capture the page URL
		String url = driver.getCurrentUrl();
		System.out.println("Page URL is"+ url);		
		//To Capture the source code of the current web page
		String sourcecode = driver.getPageSource();
		System.out.println("Page Source Code is"+ url);
		//To Capture the section id
		String id = driver.getWindowHandle();
		System.out.println("This is section id"+ id);			//To Close browser the browser
		//to get the address of parent window
				String parentWindowId = driver.getWindowHandle();
				System.out.println(parentWindowId);

				// to search the word in webbrowser in java
				WebDriver driver1=new ChromeDriver();
				Thread.sleep(4000);
				driver.navigate().to("https://www.google.com/");
			Thread.sleep(4000);
			driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
				//To close the browser
		driver.close();
		Thread.sleep(2000);
		System.out.println("Get The Details");
		

	}
}
