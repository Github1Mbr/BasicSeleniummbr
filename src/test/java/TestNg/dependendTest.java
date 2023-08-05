package TestNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class dependendTest {
	//for wantedly fail some some statement we are using assiert
	@Test
	public void createCustomer() //failed
	{
	Assert.fail(); //import org.testng.Assert//purposefully failling the statement
		System.out.println("Customer vignes");
	} 
//for perpose fully i stop or not execute the statement for that i am using assert
	@Test
	public void createcustomer()//failed if the statement is false then other statement need to be not executed 
	{
		System.out.println("Customer added");
		}	

	@Test(dependsOnMethods = "Createcustomer")
	public void ModifyCustomer()
	{
		System.out.println("modify the customer");
		}	

@Test	
	public void deleteCustomer()
	{
		System.out.println("customer deleted");
		}	
}
