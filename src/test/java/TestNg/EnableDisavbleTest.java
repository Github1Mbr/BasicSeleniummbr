package TestNg;

import org.testng.annotations.Test;

public class EnableDisavbleTest {

	@Test//i will not given any priority to that this test annotation
	//for non giving priority the default priority automatically generate as priority 0
	public void createcustomer()
	{
		System.out.println("Customer added");
		}	
	
	@Test(invocationCount = 3,priority = 0)
	public void deleteCustomer1()
	{
		System.out.println("customer deleted 1");
		}	
//if the both @Test priority is same it will consider the ascii value and execute 
		@Test(priority = 1)
		public void VerifyCustomer()
		{
			System.out.println("customer deleted");
			}	
		
		@Test(enabled =  false)// it will not displaywe have two ways to hide one is invocation 0 or negative and use enable 
		public void ModifyCustomer() 
		{
			System.out.println("modify the customer");

	}

}
