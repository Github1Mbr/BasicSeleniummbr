package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleusingDropDown {
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
	//Step 3 : Identify the webelement 
WebElement multiSelectDropdown = driver.findElement(By.id("cars"));
Thread.sleep(3000); 

//Step 4:if is multiple selection drop down or single drop down - checking
Select sel=new Select(multiSelectDropdown);
boolean status=sel.isMultiple();
if(status==true)
{
	 System.out.println("Yes !! its is Multiple Select Dropdown");
}
 		
else
{
	 System.out.println("Nope !! its is Single Select Dropdown");
}

//SelectAudi and valvo options from dropdown
//Step 7:to select non value option in side the downdown - using values (Attribute values) 

sel.selectByValue("volvo");
System.out.println("Volvo is selected by value");
Thread.sleep(1000); 
//Step 7:to select non value option in side the downdown - using Stings (Attribute values) 

sel.selectByVisibleText("Audi");
System.out.println("Audi is selected by Text");
Thread.sleep(1000); 
//Step 7:to select non value option in side the downdown - using index value 

sel.selectByIndex(2);
System.out.println("Audi is selected by index");
Thread.sleep(1000); 

//de-select the Audi from the selected option in drop list
sel.deselectByVisibleText("Audi");
System.out.println("Audi is remove from select");

//deselect all the selected option
//sel.deselectAll();
//System.out.println(" remove all the select");

//get all the selected option
List<WebElement> allSel = sel.getAllSelectedOptions();
for (WebElement ele : allSel)
{
	System.out.println(ele . getText());

	}

//get first selected option
WebElement first = sel.getFirstSelectedOption();
System.out.println("First selected option"+first. getText());
 
//get wrapped element - this methos is used to give the all wrapped element inside the elements like dropdown options of induvidle elements its will show the all the text of the element  
	WebElement allElements = sel.getWrappedElement();
	System.out.println("option of all elements prints"+allElements.getText());
	}
	}