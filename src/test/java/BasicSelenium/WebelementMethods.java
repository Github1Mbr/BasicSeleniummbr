package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.dom.model.Rect;

public class WebelementMethods {
	public static void main(String[] args)throws InterruptedException
	{//Step 1 : Launch the browser
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000); 
	
	//Step 2 : Maximize the window
	driver.manage().window().maximize();
	
	//Step 3 : Load the URL demo Vtiger App
	driver.get("https://demo.actitime.com/login.do");
	 
	//Step 4 : Webmethod element - SendKeys
	driver.findElement(By.className("textField")).sendKeys("admin");
	Thread.sleep(2000);
	
	//Step 5 : Webmethod element - clear()
		driver.findElement(By.className("textField")).clear();
		
	
	driver.findElement(By.className("textField")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	String text = driver.findElement(By.className("textField")).getText();
	System.out.println(text); 
	// space empty position
	//Step 6 : Webmethod element - click()
	driver.findElement(By.id("loginButton")).click();
//Click - clear - sendkeys - Action elements
	
	//get methods 
	//Step 7 : Webmethod elements - getAttributes(String Attributes)
		String attribute = driver.findElement(By.id("loginButton")).getAttribute("id");
	System.out.println(attribute); // calling the Attribute elements
	//its Attribute value is present its output is Null

	String attribute1 = driver.findElement(By.id("loginButton")).getAttribute("abc");
	System.out.println("Name of the WebElet is"+attribute); // calling the Attribute elements o/p is Null
	//o/p a
		//Step 8 : Webmethod elements - getTagName()
			String tag = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println("Name of the WebElet is"+tag);
		// o/p login
		//Step 8 : Webmethod elements - getText()
		String text1 = driver.findElement(By.id("loginButton")).getText();
	System.out.println("Name of the WebElet is"+text1); 
	
	//Step 9 : Webmethod elements - getLocation() Position of the web element
	Point position =driver.findElement(By.id("loginButton")).getLocation();
	int posx=position.getX();
	System.out.println(posx); //printing
	int posY=position.getY();
	System.out.println(posY); //printing
//position of the element id its 752 and 352 in degree or cm its used for capture the current position  webelement postion
//we can find x and y codination of the two integer values we can identify all the webwlwment and print the location of the current object or print
 //elements 
	//Step 9 : Webmethod elements - getSize() Position of height and weight the web element	
	Dimension size = driver.findElement(By.id("loginButton")).getSize();
	//or Dimension size = pwd.getSize();
	       int height = size.getHeight();
	       int width = size.getWidth();
	       System.out.println("Element Height Is :"+height); 
	       System.out.println("Element Width Is :"+width);
	     
	  //Step 9 : Webmethod elements - getRect() Position and dimenstion of the web element
	    Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
	      int x=rect.getX();
	   	System.out.println("position of x is "+posx); //printing
	   	int Y=rect.getY();
	   	System.out.println("position of y is "+posY); //printing
	    int h = rect.getHeight();
	    System.out.println("Height of h is "+h); //printing
	     int w= rect.getWidth();
	     System.out.println("widht of w is "+w); //printing
		 
	     //Step 9 : Webmethod elements - getCssValue()- to get the css value for css property
	     String cssvalue = driver.findElement(By.id("loginButton")).getCssValue("display");
	     System.out.println("css value is "+cssvalue); 

		   //Step 10 : Webmethod elements - getCssAriaRole()- to get the element design type
	     String role = driver.findElement(By.id("loginButton")).getAriaRole();
	     System.out.println("css value is "+role);
	     String roleUserName = driver.findElement(By.className("textField")).getAriaRole();
	     System.out.println("css value is "+roleUserName);

	     //Step 11 : Webmethod elements - getAccesibleName()- to get the paricular valu and particular ofelement value
	     String accessibleName=driver.findElement(By.className("textfield")).getAccessibleName();
	     System.out.println("AccesibleName is"+accessibleName);
	     String accessibleNameBtn=driver.findElement(By.id("loginButton")).getAccessibleName();
	     System.out.println("AccesibleName is"+ accessibleNameBtn);
	     
	     driver.get("http://local:8888");
	     String Name1=driver.findElement(By.name("user_name")).getAccessibleName();
	     System.out.println(Name1);
	  
	     //Step 11 : Webmethod elements - isDisplayed()- to check if the element is displayed/present in the current Dot 
	     Boolean elementDispled=driver.findElement(By.name("user_name")).isDisplayed();
	     if(elementDispled==true)
	     {
	     driver.findElement(By.name("user_name")).sendKeys("admin");
	     System.out.println("element display");
	     }
	     else
	     {
	    	 System.out.println("element not presented");
	     }

	     //Step 11 : Webmethod elements - isenable()- to check if the element is displayed/present in the enable or not 
	     
	     Boolean enabled =driver.findElement(By.name("user_name")).isSelected();
	     if(enabled==true)
	     {
	     driver.findElement(By.name("user_name")).clear();
	     System.out.println("element enable");
	     }
	     else
	     {
	    	 System.out.println("element not enabled");
	}

	     //Step 11 : Webmethod elements - isSelect()- to check if the element are selected or not 
	     
	     Boolean selected=driver.findElement(By.name("user_name")).isSelected();
	     if(selected==true)
	     {
	    	 System.out.println("element delected");
	     }
	     else
	     {
	    	 System.out.println("element not selected");
	     }
	     //Step 11 : Webmethod elements - getDomAttribute()- to check if the DOM Attribute value 

	     String domAttribute = driver.findElement(By.name("user_name")).getDomAttribute("manager");
		 System.out.println("DOM Attribute value is" + domAttribute);

	     //Step 11 : Webmethod elements - getDomProperty()- to check if the DOM property of the web element 
		 driver.findElement(By.name("user_name")).sendKeys("chitra");
		 String propertyvalue = driver.findElement(By.name("user_name")).getDomProperty("value");
		 System.out.println(propertyvalue);

	     //Step 11 : Webmethod elements - getDomProperty()- to check if the DOM property of the web element 

			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.name("submitButton")).submit();
			System.out.println("submit method worked");
			
			//Step 11 : Webmethod elements - getshadowRoot()- to get the access of showdaw element 
//the showdow root of elements is used for i am developer i am writing a attributes using html code in tha tone comment or element is not programmed or id is not presented for that support its execute some of the code the developer need to hide the code of the element for that is known as getshadow()
			
			driver.findElement(By.name("user_password")).getShadowRoot();
		
	}
	

}
