package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bothdependent {

	@Test
	public void createCustomer()
	{
		//purposefully fail the test script 2mins
		Assert.fail();//assert(class name for validation)//purposefully need to fail it will used for analysis the failours  
		System.out.println("Create new Customer");
		}
	@Test(dependsOnMethods = "createCustomer")//modify is depended on create
	public void modifyCustomer()//fail//2mins
	{
		System.out.println("Customer Modification");
		}
	@Test(dependsOnMethods = {"createCustomer" , "modifyCustomer"})
	public void deleteCustomer() //fail//2mins
	{
		System.out.println("Delete Customer");
		}
	}

