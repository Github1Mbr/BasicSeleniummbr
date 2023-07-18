package vitiger.Practice;
 

import java.awt.dnd.peer.DropTargetPeer;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagewindowsMaxMin 
{
	private static Point targetpoistion;

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ELCOT\\\\Desktop\\\\Java selinem\\\\Selinumproject\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();//Maximize your browser window
	Thread.sleep(4000);

	//Dimension targetSize = new Dimension(700,500);//we need to clear java import delete and come to new dimension we need to change the dimension in selenium
	//driver.manage().window().setSize(targetSize);
	 Point TargetPostion = new Point(30,250);//first write new point after that type a targetposition select local variable and come to point and select selenium
	 driver.manage().window().setPosition(targetpoistion);
	driver.quit();
	
	}

}
