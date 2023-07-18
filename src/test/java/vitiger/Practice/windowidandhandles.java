package vitiger.Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowidandhandles 
{
	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\Java selinem\\Selinumproject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=15316858002&extra_1=s%7Cc%7C563139538274%7Cb%7Cfacebook%7C&placement=&creative=563139538274&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D15316858002%26adgroupid%3D130780223675%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D1007816%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI8aKclbCQ_wIVj219Ch2GXQ4zEAAYASAAEgIONfD_BwE");
		Thread.sleep(5000);
		//to get the address of parent window
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		//Opening a new window(Child Window)
		driver.findElement(By.linkText("Already have an account?")).click();
		Thread.sleep(2000);
		
		//to get the address of both windows
		Set<String> allwindowIds = driver.getWindowHandles();
		System.out.println(allwindowIds);
		
	}
	}
