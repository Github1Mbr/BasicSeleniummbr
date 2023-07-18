package ScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshoothomepage {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//step1 lanuch the browser
		WebDriver driver = new ChromeDriver();
		
		//step2 maximixe the window
				driver.manage().window().maximize();
		
		//step3 Load the URL
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		System.out.println("hi1");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		System.out.println("hi2");
		driver.findElement(By.id("submitButton")).click();
		System.out.println("hi3");
		System.out.println("Home Page Displayed");
	
	//Taken ScreenShoot of Homepage
		//Step1  cat the takescreenshoot interface to the driver
		TakesScreenshot  ts =(TakesScreenshot) driver;
		System.out.println("hi1");
		//Step2 call get 
		File srcLocation=ts.getScreenshotAs(OutputType.FILE);
//src isa tempory file it a location to store the Screenshot in folder		methodname                  sTATIC-FILE MEANS ITS EASY TI MAKE IMAGE FORMATE AND ITS A INTERFACE USING TO SELECT MULTIPLE SELECTION PROCESS
	//	VARIABLE SOURCE IS OR RETURN VALUE IS FILE MEANS FILE ARRAY BYTE MEANS BYTE ARRAY 
	//we need to select the current project create new and create a new folder
		System.out.println("hi2");
		//Step3 create a folder to store the screen shoots
File destinationLocation = 	new File("C:\\Users\\ELCOT\\Desktop\\Java selinem\\AutomationFramework2023\\Screenshotimage\\Screenshotimage1.png");	 //fir this file (sting value we need to give a property file name of screenshot(select screenshot image folder right click and its shown the property file in that all ))
		//File destinationLocation =	new File(".\\Screenshotimage\\Screenshotimage2.png");	 //. is a current project we are using the file in smae project the jvm sill accpet the path and execute 	
		System.out.println("hi3");
	//Step4 copy the screenshot from src to dst
	//File copy and past is not possible in java operation for thaat we are using 3 part tool coomons.io in maven mvr.com
	Files.copy(srcLocation,destinationLocation);//file class is used from common.in
//Files.copy(srcLocation, destinationLocation);
	System.out.println("hi4");
	//for screenshot image visible v=select the folder and right click make a folder refresh
	}
	}
