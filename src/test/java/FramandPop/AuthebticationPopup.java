package FramandPop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AuthebticationPopup {
	public static void main(String[] args) throws IOException  {

		// APP url:- https://the-internet.herokuapp.com/basic_auth
		// App authentication username - admin
		// App authentication password - admin
		
		// https://admin:admin@the-internet.herokuapp.com/basic_auth

		//admin	admin
		// Step 1: Launch the browser
		WebDriver driver = new ChromeDriver();

		// Step 2: maximize the window
		driver.manage().window().maximize();

		// Step 3: wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load the application
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Runtime.getRuntime().exec("C:\\Users\\ELCOT\\Documents\\Author1.exe");
		
//we need to check whether this another code is working or not		
	//driver.get("https://www.foundit.in/seeker/registration");
		
		//WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		
		//ele.sendKeys("C:\\Users\\ELCOT\\Downloads\\Copy of Test Engineering Freshers' resume - Copy.docx");
		//location of current folder in we need select from the our system
	//System.out.println("file uploaded");
		
		

	}
}
