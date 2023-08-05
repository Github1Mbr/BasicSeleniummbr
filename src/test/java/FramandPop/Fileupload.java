package FramandPop;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	public static void main(String[] args) throws IOException {

		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load the application
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
//		
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		System.out.println("File uploading complete1");
		//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		System.out.println("File uploading complete2");
				
//		Upload the file using AutoIT
		Runtime.getRuntime().exec("C:\\Users\\ELCOT\\Documents\\M3.exe"); //this location id we need to take from autoid editor script after compling the location is viewed
		//getruntime is manitory and .exe file is uploaded filed we can use 
		System.out.println("File uploading complete3");
		
	//driver.get("https://www.foundit.in/seeker/registration");
		
		//WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		
		//ele.sendKeys("C:\\Users\\ELCOT\\Downloads\\Copy of Test Engineering Freshers' resume - Copy.docx");
		//location of current folder in we need select from the our system
	//System.out.println("file uploaded");
		
		
	}
}
