package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ProperityFile {

	public static void main(String[] args) throws Throwable 
	{
		// reading //Step 1: open the file in java readable format - . specifies current project - understood by jvm
		FileInputStream fis = new FileInputStream("C:\\Users\\ELCOT\\Desktop\\Java selinem\\AutomationFramework2023\\src\\test\\resources\\CommonData.properties");
		//FileInputStream .java.io , FileInputStream(String)  its a overload method and path of the folder
		//("C:\Users\ELCOT\Desktop\Java selinem\AutomationFramework2023\src\test\resources\CommonData.properties") - complete location of the file or we can give .\src\test\resources\CommonData.properties-.dot means inside the folder or program files
		//for creating a path give a //
		
		//loading//Step 2: Create an object of properties class
		Properties p = new Properties(); //new properity is a loading
		//this is a java libery  package is java.util with is going to handle the project 
		
		//Step 3: load the file input stream to properties
		p.load(fis); //it may be properity or it may be a excel or jvm
		
		
		//Step 4: use the key to get the value
		String value = p.getProperty("username");//what ever we given in the commondata.property that will print 
		String value1 = p.getProperty("abc");//it will give null the key is tell for that data no value is present in .property file it will not show the exception or error files
	//	getproperity(dtring) 
		
		//Step 5: use the value
		System.out.println(value);
		System.out.println(value1);
		
	}


}
