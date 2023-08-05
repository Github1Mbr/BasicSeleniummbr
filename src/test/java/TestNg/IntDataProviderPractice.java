package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//when ever we start the program first we need to mention @DataProvider after only we need to start the @Test


public class IntDataProviderPractice {

		@Test(dataProvider = "getData")
		public void dataProviderDemo(String name, int price) // capture the data from DataProvider
		{
			System.out.println("Phone is -> "+name+" and Price is -> "+price);
		}
		
		
		@DataProvider
		public Object[][] getData() // also working based on rows and columns its a two diamention array
		{                             //row-3 columns-3 
			//3 rows and 2 columns 3 different data set with 2 specification
			//vcx;
			
			Object[][] data = new Object[3][2];
			//when we crate a objects we need to select the first row and second is colums
			data[0][0] = "iphone"; // one data set
			data[0][1] = 25000;
			
			data[1][0] = "Samsung"; // second data set
			data[1][1] = 20000;
			
			data[2][0] = "Vivo"; // Third Data set
			data[2][1] = 10000;
			
			return data;
		}
		

		

}
