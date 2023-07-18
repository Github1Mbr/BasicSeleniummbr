package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Select Class Practice
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectclasspractice 
{
	public static void main(String[] args)throws InterruptedException
	{		

	//Step 1 : Launch the browser
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000); 
		
		//Step 2 : Maximize the window
		driver.manage().window().maximize();
		
		//Step 3 : Load the URL
		driver.get("https://demoqa.com/select-menu");
	Thread.sleep(3000); 

	//Step 4: Locate a drop down
	WebElement singleSelectDropdown = driver.findElement(By.id("oldSelectMenu"));
		Thread.sleep(1000); 
		
	
	//Step 5: to handle the dropdown create object of select class
	Select sel = new Select(singleSelectDropdown);
	
	//Step 6:to select option in side the updowndown - using index
	sel.selectByIndex(9);
	System.out.println("index 9 selected");
	Thread.sleep(1000); 
	
	//Step 6:to select non value option in side the updowndown - using index 
		//sel.selectByIndex(9);
		//System.out.println("index 12 selected");
		//o/p is nosuchelement is present error
	
	//Step 7:to select non value option in side the downdown - using values (Attribute values) 
	sel.selectByValue("7"); //Attribue value 7
	System.out.println("value selected");
	Thread.sleep(1000); 
	
	//Step 8:to select non value option in side the downdown - using String value 
 sel.selectByVisibleText("Yellow");
 System.out.println("Selected String");
	Thread.sleep(1000); 
	
	//Step 9:if the downdown is multiple selection drop down or single drop down - checking
	boolean status=sel.isMultiple();
	if(status==true)
	{
		 System.out.println("Yes !! its is Multiple Select Dropdown");
	}
	 		
	else
	{
		 System.out.println("Nope !! its is Single Select Dropdown");
	}
//check all the options inside a drop down to display in eclipse
	//List<WebElement> listop=sel.getOptions();
		//	for(WebElement element : listop)
	//{
		
		//System.out.println(sel.getOptions());
		
		//}
	//check all the options inside using by count a drop down to display - using by count 
		List<WebElement> listop1=sel.getOptions();
		int count = 0;	
		
		for(WebElement ele : listop1)
			{
				count++;
				System.out.println(ele.getText());
					
				}

	}
}